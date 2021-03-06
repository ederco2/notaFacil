package com.betha.notafacil.repository;

import com.betha.notafacil.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> , QuerydslPredicateExecutor<Cidade> {
}
