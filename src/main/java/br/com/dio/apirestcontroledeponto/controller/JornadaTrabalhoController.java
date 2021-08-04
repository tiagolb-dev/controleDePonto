package br.com.dio.apirestcontroledeponto.controller;

import br.com.dio.apirestcontroledeponto.models.JornadaTrabalho;
import br.com.dio.apirestcontroledeponto.repository.JornadaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping(value="/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaRepository jornadaRepository;

    @PostMapping("/jornada")
    @ApiOperation(value="Salva uma jornada de trabalho.")
    public JornadaTrabalho salvaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    @GetMapping
    @ApiOperation(value="Retorna uma lista de jornada de trabalho")
    public List<JornadaTrabalho> listaJornadaList(){
        return jornadaRepository.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value="Retorna uma única jornada de trabalho através do id.")
    public JornadaTrabalho listaJornadaUnica(@PathVariable(value="id") long id){
        return jornadaRepository.findById(id);
    }

    @PutMapping
    @ApiOperation(value="Atualiza uma jornada de trabalho")
    public JornadaTrabalho atualizaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    @DeleteMapping("/jornada")
    @ApiOperation(value="Excluí uma jornada de trabalho")
    public void deletaJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        jornadaRepository.delete(jornadaTrabalho);
    }
}
