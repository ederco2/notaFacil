package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.ListaServicos;
import com.betha.notafacil.model.Responsavel;
import com.betha.notafacil.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/responsavel")
public class ResponsavelController {

    @Autowired
    ResponsavelRepository repository;

    @GetMapping
    public List<ResponsavelDTO> getResponsavel(){
        return repository.findAll().stream().map(l-> ResponsavelDTO.toDTO(l)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponsavelDTO getResponsavelId(@PathVariable(value = "id") Long responsavelId) throws EntityNotFoundException {
        Responsavel responsavelFind = repository.findById(responsavelId)
                .orElseThrow(()-> new EntityNotFoundException("Responsavel não encontrado com o ID::"+responsavelId));
        return ResponsavelDTO.toDTO(responsavelFind);
    }

    @PostMapping
    public ResponsavelDTO  create(@RequestBody Responsavel responsavel){
        return ResponsavelDTO.toDTO(repository.save(responsavel));
    }

    @PutMapping("/{id}")
    public Responsavel update(@PathVariable(value="id") Long responsavelId,
                                @RequestBody Responsavel responsavel) throws EntityNotFoundException{
        Responsavel responsavelFind = repository.findById(responsavelId)
                .orElseThrow(()-> new EntityNotFoundException("Responsavel não encontrado com ID::"+responsavelId));
        responsavelFind.setId(responsavel.getId());
        responsavelFind.setBairro(responsavel.getBairro());
        responsavelFind.setCelular(responsavel.getCelular());
        responsavelFind.setCpf(responsavel.getCpf());
        responsavelFind.setNome(responsavel.getNome());
        responsavelFind.setTelefone(responsavel.getTelefone());
        return repository.save(responsavelFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable(value = "id")Long responsavelId) throws EntityNotFoundException{
        Responsavel responsavelFind = repository.findById(responsavelId)
                .orElseThrow(()-> new EntityNotFoundException("Responsavel não encontrado com ID::"+responsavelId));
        repository.delete(responsavelFind);
        return ResponseEntity.noContent().build();
    }
}
