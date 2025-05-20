package com.wellsfargo.counselor.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private LocalDateTime purchaseDate;

    protected security() {}

    public security(portfolio portfolio, String name, String category, float price, int quantity, LocalDateTime purchaseDate) {
        this.portfolio = portfolio;
        this.purchaseDate = purchaseDate;

        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public LocalDateTime getDate() {
        return purchaseDate;
    }

    public void setDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}