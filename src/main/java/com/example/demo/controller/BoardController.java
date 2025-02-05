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
		return boardService.saveBoard(board);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBoard(@PathVariable Long id) {
		boardService.deleteBoard(id);
	}
}
