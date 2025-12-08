package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Board;

@Mapper
public interface BoardDao {

	int insert(Board board);

	int count();

	List<Board> list(int page);

	void updatecount(int no);

	Board content(int no);

	int update(Board board);

	int delete(int no);

}
