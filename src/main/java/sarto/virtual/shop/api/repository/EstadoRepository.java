package sarto.virtual.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarto.virtual.shop.api.entity.Estado;

import java.util.List;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

    List<Estado> findByNomeContainingIgnoreCase(String nome);
}
