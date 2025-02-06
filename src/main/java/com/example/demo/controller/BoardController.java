package com.example.demo.controller;
import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/boards")
public class BoardController {
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping
	public List<Board> getAllBoards(){
		return boardService.getAllBoards();
	}
	
	@GetMapping("/{id}")
	public Optional<Board> getBoardById(@PathVariable Long id){
		return boardService.getBoardById(id);
	}
	
	@PostMapping
	public Board saveBoard(@RequestBody Board board) {
	    // 🚀 클라이언트에서 받은 데이터 확인
	    System.out.println("📌 [Debug] 받은 데이터:");
	    System.out.println("Title: " + board.getTitle());
	    System.out.println("Content: " + board.getContent());
	    System.out.println("Writer: " + board.getWriter());

	    return boardService.saveBoard(board);
	}

	
	@DeleteMapping("/{id}")
	public void deleteBoard(@PathVariable Long id) {
		boardService.deleteBoard(id);
	}
}
