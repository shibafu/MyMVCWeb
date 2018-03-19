package com.tsugaruinfo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tsugaruinfo.model.MyMemoData;
import com.tsugaruinfo.repository.MyMemoDataRepository;


@Controller
public class AppController {

	@Autowired
	MyMemoDataRepository repository;
	
	@RequestMapping("/msg")
	public String message(Model model) {
		
		model.addAttribute("msg", "This is message from controller!");
		
		return "showMessage";
	}
	
	@RequestMapping(value="/msg", method=RequestMethod.POST)
	public ModelAndView postMessage(@RequestParam("title") String title,
			@RequestParam("content") String content) {
		ModelAndView mv = new ModelAndView("showMessage");
		
		MyMemoData memo = new MyMemoData(title, content);
		repository.saveAndFlush(memo);
		
		mv.addObject("msg", "add memo<br>" + memo.toString());
		return mv;
	}
	
	@RequestMapping(value="/memo", method=RequestMethod.GET)
	public ModelAndView memoRefferense(Model model) {
		ModelAndView mv = new ModelAndView("showMessage");

		List<MyMemoData> list = repository.findAll();
		
		String result = "<pre>";
		
		for(MyMemoData memo : list) {
			result += memo.toString() + "\n";
		}
		result += "</pre>";
		
//		model.addAttribute("msg", result);
		mv.addObject("msg", result);
		
		return mv;
	}
}
