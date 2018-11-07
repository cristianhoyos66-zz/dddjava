package com.example.dddjava.domain.board;

import com.example.dddjava.infrastructure.board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public Board findById(BoardId boardId) {
        return boardRepository.findById(boardId).orElse(null);
    }
}
