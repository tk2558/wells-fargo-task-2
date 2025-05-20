package com.wellsfargo.counselor.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private client client;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    protected portfolio() {}

    public portfolio(client client, LocalDateTime creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public client getCLient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return creationDate;
    }

    public void setDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}