package com.betha.notafacil.resource;


import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.EmissaoNotas;
import com.betha.notafacil.repository.ContribuinteRepository;
import com.betha.notafacil.repository.EmissaoNotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/emissaonotas")
public class EmissaoNotasController extends AbstractResource{
    @Autowired
    EmissaoNotasRepository emissaoNotasRepository;

    @Autowired
    private ContribuinteRepository contribuinteRepository;

    @GetMapping
    public List<EmissaoNotasDTO> getEmissaoNotas() {
        return emissaoNotasRepository.findAll().stream().map(p -> EmissaoNotasDTO.toDTO(p)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EmissaoNotasDTO getPaisesId(@PathVariable(value = "id") Long emissaoId) throws EntityNotFoundException {

        EmissaoNotas emissaoFind = emissaoNotasRepository.findById(emissaoId)
                .orElseThrow(() -> new EntityNotFoundException("Locacao não encontrado com ID :: " + emissaoId));

        return EmissaoNotasDTO.toDTO(emissaoFind);
    }

    @PostMapping
    public EmissaoNotaDTO create(@Valid @RequestBody EmissaoNotas emissaoNotas)  {
        return EmissaoNotaDTO.toDTO(emissaoNotasRepository.save(emissaoNotas));
    }

    @PutMapping("/{id}")
    public EmissaoNotas update(@PathVariable(value="id") Long emissaoId,
        @RequestBody EmissaoNotas emissaoNotas) throws EntityNotFoundException{
        EmissaoNotas emissaoFind = emissaoNotasRepository.findById(emissaoId)
                .orElseThrow(() -> new EntityNotFoundException("Emissao não encontrado com ID :: " + emissaoId));
        emissaoFind.setId(emissaoNotas.getId());
        emissaoFind.setStatusServico(emissaoNotas.getStatusServico());
        emissaoFind.setListaServicos(emissaoNotas.getListaServicos());
        emissaoFind.setEmpresa(emissaoNotas.getEmpresa());
        emissaoFind.setContribuinte(emissaoNotas.getContribuinte());
        emissaoFind.setData(emissaoNotas.getData());
        emissaoFind.setQtdServico(emissaoNotas.getQtdServico());
        emissaoFind.setValorServico(emissaoNotas.getValorServico());
        emissaoFind.setTipoServico(emissaoNotas.getTipoServico());

        return emissaoNotasRepository.save(emissaoFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long emissaoId) throws EntityNotFoundException {
        EmissaoNotas emissaoFind = emissaoNotasRepository.findById(emissaoId)
                .orElseThrow(() -> new EntityNotFoundException("Emissão não encontrado com ID :: " + emissaoId));

        emissaoNotasRepository.delete(emissaoFind);

        return ResponseEntity.noContent().build();
    }

}
