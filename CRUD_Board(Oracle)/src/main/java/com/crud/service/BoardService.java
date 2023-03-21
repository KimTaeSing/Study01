package com.crud.service;

import java.util.List;

import com.crud.model.BoardVO;

public interface BoardService {
	
//	게시판 등록
	public void enroll(BoardVO board);
//  게시글 목록
	public List<BoardVO> getList();
}
