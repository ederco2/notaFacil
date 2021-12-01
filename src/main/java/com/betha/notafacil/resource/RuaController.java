package com.betha.notafacil.resource;



import com.betha.notafacil.enterprise.EntityNotFoundException;
import com.betha.notafacil.model.Rua;
import com.betha.notafacil.repository.RuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/ruas")
public class RuaController extends AbstractResource{

    @Autowired
    private RuaRepository repository;
    /*
      @GetMapping
      public List<RuaDTO> getRuas(@QuerydslPredicate(root = Rua.class) Predicate predicate) {
          List<RuaDTO> result = new ArrayList<>();
          Iterable<Rua> all = repository.findAll(predicate);
          all.forEach(f -> result.add(RuaDTO.toDTO(f)));
          return result;
      }
  */
      @GetMapping
      public List<RuaDTO> getRua() {
          return repository.findAll().stream().map(p -> RuaDTO.toDTO(p)).collect(Collectors.toList());
      }

    @GetMapping("/{id}")
    public RuaDTO getRuasId(@PathVariable(value = "id") Long ruaId) throws EntityNotFoundException {
        Rua ruaFind = repository.findById(ruaId)
                .orElseThrow(()-> new EntityNotFoundException("Rua não encontrado com o ID::"+ruaId));
        return RuaDTO.toDTO(ruaFind);
    }

    @PostMapping
    public RuaDTO  create(@RequestBody Rua rua){
        return RuaDTO.toDTO(repository.save(rua));
    }

    @PutMapping("/{id}")
    public Rua update(@PathVariable(value="id") Long ruaId,
                         @RequestBody Rua rua) throws EntityNotFoundException{
        Rua ruaFind = repository.findById(ruaId)
                .orElseThrow(()-> new EntityNotFoundException("Rua não encontrada com ID::"+ruaId));
        ruaFind.setId(rua.getId());
        ruaFind.setNome(rua.getNome());
        ruaFind.setCep(rua.getCep());
        ruaFind.setTipo(rua.getTipo());
        ruaFind.setBairro(rua.getBairro());
        return repository.save(ruaFind);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable(value = "id")Long ruaId) throws EntityNotFoundException{
        Rua ruaFind = repository.findById(ruaId)
                .orElseThrow(()-> new EntityNotFoundException("Rua não encontrada com ID::"+ruaId));
        repository.delete(ruaFind);
        return ResponseEntity.noContent().build();
    }

}
