package edu.mum.service;

import java.util.List;

import edu.mum.domain.Category;

 public interface CategoryService  {	
		public Category getCategory(int id);	
		public List<Category> getAll();	
}
 
