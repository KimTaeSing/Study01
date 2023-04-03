package com.crud.controller;

import java.util.HashMap;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	// 보기 페이지 진입 컨트롤러
	@GetMapping("/list")
	public void boardListGET(Model model) {
		log.info("게시판 목록 페이지 진입");
		model.addAttribute("list", bservice.getList());

	}

	// 게시글 읽기 페이지 진입 컨트롤러
	@GetMapping("/viewPage")
	public void boardGetPage(Model model, int bno) {
		model.addAttribute("getInfo", bservice.getPage(bno));
	}
	
	

	// 게시판 수정 페이지 진입 컨트롤러
	@GetMapping("/updatePage")
	public void updatePageGET(@RequestParam("bno") int bno, Model model) {
		log.info("수정 페이지 진입 성공");
	}
	
	@PostMapping("/updatePage")
	@ResponseBody
	public HashMap<String, Object> updateAjaxGET(@RequestParam("bno")int bno){
		log.info("bno : "+ bno);
		HashMap<String, Object> result = new HashMap<>();
		result.put("list", bservice.updatePage(bno));
		log.info("result : "+ result);
		return result;
		
	}

	@PostMapping("/del_board")
	public String del_board(@RequestParam("bno1") int bno, RedirectAttributes rttr) {
		log.info("게시글 삭제 컨트롤러 진입");
		log.info("bno 확인 : "+ bno);
		bservice.delBoard(bno);
		rttr.addFlashAttribute("result","del_success");
		return "redirect:/board/list";
	}
	
	// 등록 페이지 진입 컨트롤러
	@GetMapping("/enroll")
	public void boardenrollGET(BoardVO board) {
		log.info("게시판 등록 페이지 진입");

	}

	// 등록 컨트롤러
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		bservice.enroll(board);
		// 사용자가 등록을 완료했다는 피드백을 알려주기 위해 RedirectAttributes 메소드를 시용 하였음 !
		rttr.addFlashAttribute("result", "success");

		return "redirect:/board/list";
	}
	
	// 수정 컨트롤러
	@PostMapping("/update")
	public String boardupdatePOST(BoardVO board, RedirectAttributes rttr) {
		System.out.println("test : " + board);
			bservice.update(board);
			rttr.addFlashAttribute("result", "update");
		return "redirect:/board/list";
	}

}
