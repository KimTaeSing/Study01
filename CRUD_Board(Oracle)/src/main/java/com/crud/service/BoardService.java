package com.crud.service;

import java.util.List;

import com.crud.model.BoardVO;

public interface BoardService {
	
//	게시판 등록
	public void enroll(BoardVO board);
//  게시글 목록
	public List<BoardVO> getList();
//  게시글 읽기
	public BoardVO getPage(int bno);
//  게시판 수정(읽기)
	public List<BoardVO> updatePage(int bno);
	
//	게시글 삭제
	public void delBoard(int bno);
	
}
