package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Bairro;
import com.betha.notafacil.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/bairros")
public class BairroController {


    @Autowired
    private BairroRepository repository;

    @GetMapping
    public List<BairroDTO> getBairro() {
        return repository.findAll().stream().map(p -> BairroDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public BairroDTO getBairrosId(@PathVariable(value = "id") Long bairroId) throws EntityNotFoundException {

        Bairro bairroFind = repository.findById(bairroId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID :: " + bairroId));

        return BairroDTO.toDTO(bairroFind);
    }


    @PostMapping
    public BairroDTO create(@Valid @RequestBody Bairro bairro) {
        return BairroDTO.toDTO(repository.save(bairro));
    }


    @PutMapping("/{id}")
    public BairroDTO update(@PathVariable(value = "id") Long bairroId,
                            @RequestBody Bairro bairro) throws EntityNotFoundException {
        Bairro bairroFind = repository.findById(bairroId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID :: " + bairroId));
        bairroFind.setId(bairro.getId());
        bairroFind.setNome(bairro.getNome());
        bairroFind.setPopulacao(bairro.getPopulacao());
        bairroFind.setCidade(bairro.getCidade());
        return BairroDTO.toDTO(repository.save(bairroFind));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long bairroId) throws EntityNotFoundException {
        Bairro bairroFind = repository.findById(bairroId)
                .orElseThrow(() -> new EntityNotFoundException("Estado não encontrado com ID :: " + bairroId));

        repository.delete(bairroFind);

        return ResponseEntity.noContent().build();
    }
}
