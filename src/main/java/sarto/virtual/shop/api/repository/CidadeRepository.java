package sarto.virtual.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarto.virtual.shop.api.entity.Cidade;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    List<Cidade> findByNomeContainingIgnoreCase(String nome);
}
