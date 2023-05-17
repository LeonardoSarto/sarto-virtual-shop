package com.sarto.virtual.shop.controller;

import com.sarto.virtual.shop.dto.EstadoDto;
import com.sarto.virtual.shop.entity.Estado;
import com.sarto.virtual.shop.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estado")
public class EstadoController {

    @Autowired
    EstadoService estadoService;

    @GetMapping()
    public List<Estado> listarTodos() {
        return estadoService.listarTodos();
    }

    @PostMapping()
    public void cadastrar(@RequestBody EstadoDto estadoDto) {
        estadoService.cadastrar(estadoDto);
    }

    @DeleteMapping()
    public void excluir(@RequestParam Long id) {
        estadoService.excluir(id);
    }

    @PutMapping()
    public void atualizar(@RequestBody EstadoDto estadoDto) {
        estadoService.atualizar(estadoDto);
    }
}
