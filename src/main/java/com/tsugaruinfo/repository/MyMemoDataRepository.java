package com.tsugaruinfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsugaruinfo.model.MyMemoData;

@Repository
public interface MyMemoDataRepository extends JpaRepository<MyMemoData, Long> {
	public List<MyMemoData> findByTitle(String title);
}
