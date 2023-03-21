package com.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.model.BoardVO;
import com.crud.service.BoardService;

// 해당 클래스를 컨트롤러로 사용하겠다는 어노테이션 
@Controller
// 어떤 컨트롤러에 어떤 메소드가 처리할지를 매핑하는 어노테이션 !
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	// 필요한 의존객체 타입에 해당하는 빈을 찾아 주입하는 어노테이션 !
	@Autowired
	private BoardService bservice;

	@GetMapping("/list")
	public void boardListGET(Model model) {
		log.info("게시판 목록 페이지 진입");
		model.addAttribute("list", bservice.getList());

	}

	@GetMapping("/enroll")
	public void boardenrollGET(BoardVO board) {
		log.info("게시판 등록 페이지 진입");

	}

	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		log.info("데이터 테스트 : " + board);
		bservice.enroll(board);
		// 사용자가 등록을 완료했다는 피드백을 알려주기 위해 RedirectAttributes 메소드를 시용 하였음 !
		rttr.addFlashAttribute("result", "success");

		return "redirect:/board/list";
	}

}
