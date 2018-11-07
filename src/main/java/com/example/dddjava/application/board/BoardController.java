package com.example.dddjava.application.board;

import com.example.dddjava.domain.board.Board;
import com.example.dddjava.domain.board.BoardId;
import com.example.dddjava.domain.board.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("board/{id}")
    public Board getBoardById(@PathVariable String id) {
        return boardService.findById(BoardId.of(id));
    }

}
