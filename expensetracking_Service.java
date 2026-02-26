package com.example.expense.tracking.service;

//import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.expense.tracking.model.expensetracking_model ;
import com.example.expense.tracking.repository.expensetracking_repository;

public class expensetracking_Service<Expense> {
     
	@Autowired
	 private final expensetracking_repository repository;

	 public expensetracking_Service(expensetracking_repository repository) {
		 this.repository = repository;
	 }

	 public expensetracking_model saveExpense(expensetracking_model expense) {
		    return repository.save(expense);
		}

	    public List<expensetracking_model> getAllExpenses() {
	    	return repository.findAll();
	    }

	    public expensetracking_model updateExpense(Long id, expensetracking_model expenseDetails) {

	        expensetracking_model expense = repository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Expense not found"));

	        expense.setTitle(expenseDetails.getTitle());
	        expense.setAmount(expenseDetails.getAmount());
	        expense.setCategory(expenseDetails.getCategory());
	        return repository.save(expense);
	    }

	    public void deleteExpense(Long id) {
	        repository.deleteById(id);
	    }
	 
}
