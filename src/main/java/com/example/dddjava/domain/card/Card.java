package com.example.dddjava.domain.card;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Card implements Serializable {

    @EmbeddedId
    private CardId cardId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Date creationDate;
    @Column
    private Date modificationDate;

    public Card() {
    }

    public Card(CardId cardId, String name, String description, Date creationDate, Date modificationDate) {
        this.cardId = cardId;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public CardId getCardId() {
        return cardId;
    }

    public void setCardId(CardId cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
}
