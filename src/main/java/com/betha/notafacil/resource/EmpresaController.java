package com.betha.notafacil.resource;

import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Empresa;
import com.betha.notafacil.repository.EmpresaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/empresas")
public class EmpresaController extends AbstractResource {
    private EmpresaRepository repository;

    @GetMapping
    public List<EmpresaDTO> getEmpresas() {
        return repository.findAll().stream().map(p -> EmpresaDTO.toDTO(p)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public EmpresaDTO getEmpresasId(@PathVariable(value = "id") Long empresaId) throws EntityNotFoundException {

        Empresa empresaFind = repository.findById(empresaId)
                .orElseThrow(() -> new EntityNotFoundException("Empresa não encontrado com ID :: " + empresaId));

        return EmpresaDTO.toDTO(empresaFind);
    }


    @PostMapping
    public EmpresaDTO create(@Valid @RequestBody Empresa empresa) {
        return EmpresaDTO.toDTO(repository.save(empresa));
    }


    @PutMapping("/{id}")
    public Empresa update(@PathVariable(value = "id") Long empresaId,
                         @RequestBody Empresa empresa) throws EntityNotFoundException {
        Empresa empresaFind = repository.findById(empresaId)
                .orElseThrow(() -> new EntityNotFoundException("Empresa não encontrado com ID :: " + empresaId));
        empresaFind.setId(empresa.getId());
        empresaFind.setSituacao(empresa.getSituacao());
        empresaFind.setResponsavel(empresa.getResponsavel());
        empresaFind.setRazaoSocial(empresa.getRazaoSocial());
        empresaFind.setPorteEmpresa(empresa.getPorteEmpresa());
        empresaFind.setOptante(empresa.getOptante());
        empresaFind.setNomeEmpresa(empresa.getNomeEmpresa());
        empresaFind.setCnpj(empresa.getCnpj());
        empresaFind.setCEP(empresa.getCEP());
        empresaFind.setBairro(empresa.getBairro());
        empresaFind.setAtividade(empresa.getAtividade());
        return repository.save(empresaFind);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long empresaId) throws EntityNotFoundException {
        Empresa empresaFind = repository.findById(empresaId)
                .orElseThrow(() -> new EntityNotFoundException("Empresa não encontrado com ID :: " + empresaId));

        repository.delete(empresaFind);

        return ResponseEntity.noContent().build();
    }

}
