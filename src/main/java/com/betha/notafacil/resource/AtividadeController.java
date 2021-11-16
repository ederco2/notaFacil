package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Atividade;
import com.betha.notafacil.model.Cidade;
import com.betha.notafacil.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/atividades")
public class AtividadeController extends  AbstractResource{
    @Autowired
    AtividadeRepository repository;

    @GetMapping
    public List<AtividadeDTO> getAtividades() {
        return repository.findAll().stream().map(p -> AtividadeDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AtividadeDTO getAtividadesId(@PathVariable(value = "id") Long atividadesId) throws EntityNotFoundException {

        Atividade atividadeFind = repository.findById(atividadesId)
                .orElseThrow(() -> new EntityNotFoundException("Atividade não encontrado com ID :: " + atividadesId));

        return AtividadeDTO.toDTO(atividadeFind);
    }

    @PostMapping
    public AtividadeDTO create(@Valid @RequestBody Atividade atividade) {
        return AtividadeDTO.toDTO(repository.save(atividade));
    }

    @PutMapping("/{id}")
    public Atividade update(@PathVariable(value = "id") Long atividadeId,
                         @RequestBody Atividade atividade) throws EntityNotFoundException {
        Atividade atividadeFind = repository.findById(atividadeId)
                .orElseThrow(() -> new EntityNotFoundException("Atividade não encontrado com ID :: " + atividadeId));
        atividadeFind.setId(atividade.getId());
        atividadeFind.setDescricao(atividade.getDescricao());
        return repository.save(atividadeFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long atividadeId) throws EntityNotFoundException {
        Atividade atividadeFind = repository.findById(atividadeId)
                .orElseThrow(() -> new EntityNotFoundException("Atividade não encontrado com ID :: " + atividadeId));

        repository.delete(atividadeFind);

        return ResponseEntity.noContent().build();
    }

}
