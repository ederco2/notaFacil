package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.ListaServicos;
import com.betha.notafacil.repository.ListaServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/listaservico")
public class ListaServicoController {

    @Autowired
    private ListaServicoRepository repository;


    @GetMapping
    public List<ListaServicoDTO> getListaServicos(){
        return repository.findAll().stream().map(l-> ListaServicoDTO.toDTO(l)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ListaServicoDTO getListaServicosId(@PathVariable(value = "id") Long listaServicosId) throws EntityNotFoundException {
        ListaServicos listaServicosFind = repository.findById(listaServicosId)
                .orElseThrow(()-> new EntityNotFoundException("Lista de Servico não encontrado com o ID::"+listaServicosId));
        return ListaServicoDTO.toDTO(listaServicosFind);
    }

    @PostMapping
    public ListaServicoDTO  create(@RequestBody ListaServicos listaServicos){
        return ListaServicoDTO.toDTO(repository.save(listaServicos));
    }

    @PutMapping("/{id}")
    public ListaServicos update(@PathVariable(value="id") Long listaServicoId,
                         @RequestBody ListaServicos listaServicos) throws EntityNotFoundException{
        ListaServicos listaServicoFind = repository.findById(listaServicoId)
                .orElseThrow(()-> new EntityNotFoundException("Lista de Servico nao encontrado com ID::"+listaServicoId));
        listaServicoFind.setId(listaServicos.getId());
        listaServicoFind.setCodigo(listaServicos.getCodigo());
        listaServicoFind.setDescricao(listaServicos.getDescricao());
        listaServicoFind.setIssFixo(listaServicos.getIssFixo());
        listaServicoFind.setIssVariavel(listaServicos.getIssVariavel());
        listaServicoFind.setItem(listaServicos.getItem());
        return repository.save(listaServicoFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable(value = "id")Long listaServicoId) throws EntityNotFoundException{
        ListaServicos listaServicoFind = repository.findById(listaServicoId)
                .orElseThrow(()-> new EntityNotFoundException("Lista de Servico nao encontrado com ID::"+listaServicoId));
        repository.delete(listaServicoFind);
        return ResponseEntity.noContent().build();
    }

}
