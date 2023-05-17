package com.sarto.virtual.shop.repository;

import com.sarto.virtual.shop.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByNomeContainingIgnoreCase(String nome);
}
