package com.game.store.app.repository;

import com.game.store.app.model.Categoria;
import com.game.store.app.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAllByGeneroContainingIgnoreCase(@Param("genero")  String genero);
}
