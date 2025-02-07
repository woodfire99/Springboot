package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;


@Service
public class BoardService {
	private final BoardRepository boardRepository;
	
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	public List<Board> getAllBoards(){
		return boardRepository.findAll();
	}
	
	
	public Optional<Board> getBoardById(Long id){
		return boardRepository.findById(id);
	}
	
	public Board saveBoard(Board board) {
		return boardRepository.save(board);
	}
	
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
    
    public Board updateBoard(Long id, Board boardDetails) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다: " + id));

        // 변경할 내용 업데이트
        board.setTitle(boardDetails.getTitle());
        board.setContent(boardDetails.getContent());
        board.setWriter(boardDetails.getWriter());

        // 수정된 게시글 저장
        return boardRepository.save(board);
    }
}
