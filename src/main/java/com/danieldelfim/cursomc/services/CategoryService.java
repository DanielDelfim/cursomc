package com.danieldelfim.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldelfim.cursomc.domain.Categoria;
import com.danieldelfim.cursomc.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Categoria> findAll(){
		return categoryRepository.findAll();
	}

}
