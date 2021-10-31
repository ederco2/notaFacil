package com.betha.notafacil.repository;


import com.betha.notafacil.model.ListaServicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaServicoRepository extends JpaRepository<ListaServicos, Long> {
}

