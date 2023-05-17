package com.sarto.virtual.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CidadeDto {
    private Long id;
    private String nome;
    private EstadoDto estadoDto;
}
