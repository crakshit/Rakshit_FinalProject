package com.example.finalproject;

import java.util.Date;

public class Transaction {
    String type;
    String category;
    String description;
    String date;
    Double amount;

    public Transaction(String type, String category, String description, String date, Double amount) {
        this.type = type;
        this.category = category;
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    public Transaction(String type, String category, String description, Double amount) {
        this.type = type;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
