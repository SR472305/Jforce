package co.example.expense.tracking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expense.tracking.model.expensetracking_model;
import com.example.expense.tracking.service.expensetracking_Service;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin("*")

public class expensetracking_controller {
  
	private final expensetracking_Service service;
	
	 public expensetracking_controller(expensetracking_Service service) {
		 this.service = service;
	 }
	 
	 @PostMapping
	 public expensetracking_model addExpense(@RequestBody expensetracking_model  expenses) {
		    return service.saveExpense(expenses);
		}
	 
	 @GetMapping("/t")
	 public List<expensetracking_model> getAllexpensetracking_model(){
		 
		 int [] arr = {1,2,3,4};
		 
		 for(int a : arr) {
			 System.out.println(a);
		 }
		 
		 
		 
		 
		 
		return service.getAllExpenses();
	 }
	 
	 @PutMapping
	 public expensetracking_model updateExpensetracking_model(@PathVariable long id,
			 @RequestBody expensetracking_model expense) {
				return service.updateExpense(id, expense); 
	 }
	 
	 @DeleteMapping
	 public String deletString(@PathVariable long id) {
		  service.deleteExpense(id);
		  return "Expense Deleted successfully";
	 }
	
	 
}