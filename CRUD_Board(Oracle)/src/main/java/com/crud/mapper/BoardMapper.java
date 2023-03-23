package com.crud.mapper;

import java.util.List;

import com.crud.model.BoardVO;

public interface BoardMapper {

//	게시글 등록
	public void enroll(BoardVO board);
//  게시글 목록
	public List<BoardVO> getList();
//  게시글 읽기
	public BoardVO getPage(int bno);
	
	
}
