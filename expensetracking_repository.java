package com.example.expense.tracking.repository;

//import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.tracking.model.expensetracking_model;

public interface expensetracking_repository extends JpaRepository<expensetracking_model, Long>{

}
