package com.example.dddjava.domain.board;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BoardId implements Serializable {

    private final String id;

    private BoardId(String id) {
        this.id = id;
    }

    public static BoardId of(String id) {
        return new BoardId(id);
    }

}
