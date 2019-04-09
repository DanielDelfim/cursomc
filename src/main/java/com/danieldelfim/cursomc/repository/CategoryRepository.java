package com.danieldelfim.cursomc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.danieldelfim.cursomc.domain.Categoria;

@Repository
public interface CategoryRepository extends MongoRepository<Categoria, Integer>{

}
