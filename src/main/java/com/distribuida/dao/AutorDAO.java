package com.distribuida.dao;

import com.distribuida.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorDAO extends JpaRepository<Autor, Integer> {
    // Spring Data JPA generará automáticamente los métodos de CRUD (save, findAll, deleteById, etc.)
}
