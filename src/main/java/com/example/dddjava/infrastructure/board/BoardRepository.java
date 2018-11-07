package com.example.dddjava.infrastructure.board;

import com.example.dddjava.domain.board.Board;
import com.example.dddjava.domain.board.BoardId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board, BoardId> {

}
