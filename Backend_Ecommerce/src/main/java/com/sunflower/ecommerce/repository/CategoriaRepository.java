package com.sunflower.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunflower.ecommerce.model.Categoria;
import com.sunflower.ecommerce.model.Setor;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);

    public List<Categoria> findAllBySetor(Setor setor);
}