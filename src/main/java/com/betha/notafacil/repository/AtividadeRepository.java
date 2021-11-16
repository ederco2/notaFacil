package com.betha.notafacil.repository;

import com.betha.notafacil.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Long> {
}
