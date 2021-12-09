package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Contribuinte;
import com.betha.notafacil.model.Pais;
import com.betha.notafacil.repository.ContribuinteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/contribuintes")
public class ContribuinteController {

    @Autowired
    ContribuinteRepository repository;

    @GetMapping
    public List<ContribuinteDTO> getContribuinte(){
        return repository.findAll().stream().map(l-> ContribuinteDTO.toDTO(l)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ContribuinteDTO getContribuinteId(@PathVariable(value = "id") Long contribuinteId) throws EntityNotFoundException {
        Contribuinte contribuinteFind = repository.findById(contribuinteId)
                .orElseThrow(()-> new EntityNotFoundException("Contribuinte não encontrado com o ID::"+contribuinteId));
        return ContribuinteDTO.toDTO(contribuinteFind);
    }

    @PostMapping
    public ContribuinteDTO  create(@RequestBody Contribuinte contribuinte){
        return ContribuinteDTO.toDTO(repository.save(contribuinte));
    }

    @PutMapping("/{id}")
    public Contribuinte update(@PathVariable(value="id") Long contribuinteId,
                              @RequestBody Contribuinte contribuinte) throws EntityNotFoundException{
        Contribuinte contribuinteFind = repository.findById(contribuinteId)
                .orElseThrow(()-> new EntityNotFoundException("Contribuinte não encontrado com ID::"+contribuinteId));
        contribuinteFind.setId(contribuinte.getId());
        contribuinteFind.setNome(contribuinte.getNome());
        contribuinteFind.setDataNascimento(contribuinte.getDataNascimento());
        contribuinteFind.setDocumento(contribuinte.getDocumento());
        contribuinteFind.setTipodoc(contribuinte.getTipodoc());
        return repository.save(contribuinteFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long contribuinteId) throws EntityNotFoundException {
        Contribuinte ContribuinteFind = repository.findById(contribuinteId)
                .orElseThrow(() -> new EntityNotFoundException("Pais não encontrado com ID :: " + contribuinteId));

        repository.delete(ContribuinteFind);

        return ResponseEntity.noContent().build();
    }

}
