package com.betha.notafacil.repository;

import com.betha.notafacil.model.Rua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuaRepository extends JpaRepository <Rua,Long> {
}
