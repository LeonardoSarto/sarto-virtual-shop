package sarto.virtual.shop.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarto.virtual.shop.api.dto.EstadoDto;
import sarto.virtual.shop.api.entity.Estado;
import sarto.virtual.shop.api.service.EstadoService;

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
