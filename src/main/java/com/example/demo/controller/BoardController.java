package com.example.demo.controller;
import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/boards")
public class BoardController {
	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@Operation(summary = "게시글 목록 조회", description = "모든 게시글을 조회합니다.")
	@GetMapping
	public List<Board> getAllBoards(){
		return boardService.getAllBoards();
	}
	
	@Operation(summary = "게시글 찾기", description = "찾아서 조회합니다.")
	@GetMapping("/{id}")
	public Optional<Board> getBoardById(@PathVariable Long id){
		return boardService.getBoardById(id);
	}
	
	@Operation(summary = "게시글 저장", description = "게시물 저장")
	@PostMapping
	public Board saveBoard(@RequestBody Board board) {
	    return boardService.saveBoard(board);
	}

	@Operation(summary = "게시글 삭제", description = "게시물 삭제")
	@DeleteMapping("/{id}")
	public void deleteBoard(@PathVariable Long id) {
		boardService.deleteBoard(id);
	}
}
