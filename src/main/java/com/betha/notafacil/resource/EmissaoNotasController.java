package com.betha.notafacil.resource;


import com.betha.notafacil.repository.EmissaoNotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/emissaonotas")
public class EmissaoNotasController extends AbstractResource{
    @Autowired
    EmissaoNotasRepository repository;

    @GetMapping
    public List<EmissaoNotasDTO> getEmissaoNotas() {
        return repository.findAll().stream().map(p -> EmissaoNotasDTO.toDTO(p)).collect(Collectors.toList());
    }

}
