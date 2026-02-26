package com.example.expense.tracking.model;

import jakarta.persistence.*;

@Entity
@Table(name = "expenses")
public class expensetracking_model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double amount;
    private String category;

    
    public expensetracking_model() {}

    public expensetracking_model(String title, Double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

   
    public Long getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
}