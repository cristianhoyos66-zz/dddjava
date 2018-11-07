package com.example.dddjava.domain.card;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CardId implements Serializable {

    private final String cardId;

    private CardId(String id) {
        this.cardId = id;
    }

    public static CardId of(String id) {
        return new CardId(id);
    }

}
