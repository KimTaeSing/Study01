package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.model.BoardVO;
import com.crud.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
	@GetMapping("/list")
	public void boardListGET() {
		log.info("게시판 목록 페이지 진입");
		
	}
	
	@GetMapping("/enroll")
	public void boardenrollGET(BoardVO board) {
		log.info("게시판 등록 페이지 진입");
		
	}
	
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		log.info("데이터 테스트 : "+ board);
		bservice.enroll(board);
		 rttr.addFlashAttribute("result", "success");
		
		return "redirect:/board/list";
	}
	
}
