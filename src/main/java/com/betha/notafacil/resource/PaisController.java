package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Pais;
import com.betha.notafacil.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/paises")
public class PaisController extends AbstractResource{
    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<PaisDTO> getPaises() {
        return repository.findAll().stream().map(p -> PaisDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public PaisDTO getPaisesId(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {

        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));

        return PaisDTO.toDTO(paisFind);
    }


    @PostMapping
    public PaisDTO create(@Valid @RequestBody Pais pais) {
        return PaisDTO.toDTO(repository.save(pais));
    }


    @PutMapping("/{id}")
    public Pais update(@PathVariable(value = "id") Long paisId,
                       @RequestBody Pais pais) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));
        paisFind.setId(pais.getId());
        paisFind.setNome(pais.getNome());
        paisFind.setPopulacao(pais.getPopulacao());

        return repository.save(paisFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long paisId) throws EntityNotFoundException {
        Pais paisFind = repository.findById(paisId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + paisId));

        repository.delete(paisFind);

        return ResponseEntity.noContent().build();
    }
}
