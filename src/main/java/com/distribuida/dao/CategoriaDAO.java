package com.distribuida.dao;

import com.distribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDAO extends JpaRepository<Categoria, Integer> {
    // Spring Data JPA generará automáticamente los métodos de CRUD
}
