package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.mapper.BoardMapper;
import com.crud.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	@Override
	public void enroll(BoardVO board) {
		mapper.enroll(board);
		
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public BoardVO getPage(int bno) {
		return mapper.getPage(bno);
	}

	@Override
	public void delBoard(int bno) {
		mapper.delBoard(bno);
	}

	@Override
	public List<BoardVO> updatePage(int bno) {
		return mapper.updatePage(bno);
	}

	@Override
	public int update(BoardVO board) {
		// TODO Auto-generated method stub
		return mapper.update(board);
	}





}
