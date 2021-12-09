package com.betha.notafacil.resource;



import com.betha.notafacil.model.Rua;
import com.betha.notafacil.model.TipoRua;

public class RuaDTO {
    private String id;
    private String nome;
    private TipoRua tipo;
    private  String cep;
    private BairroDTO bairro;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRua getTipo() {
        return tipo;
    }

    public void setTipo(TipoRua tipo) {
        this.tipo = tipo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public BairroDTO getBairro() {
        return bairro;
    }

    public void setBairro(BairroDTO bairro) {
        this.bairro = bairro;
    }

    public static RuaDTO toDTO(Rua rua){
        RuaDTO dto = new RuaDTO();
        dto.setId(rua.getId().toString());
        dto.setNome(rua.getNome());
        dto.setCep(rua.getCep());
        dto.setTipo(rua.getTipo());
        dto.setBairro(rua.getBairro() != null ? BairroDTO.toDTO(rua.getBairro()) : null);
        return dto;
    }

    public static Rua fromDTO(RuaDTO dto) {
        Rua entity = new Rua();
        entity.setId(Long.getLong(dto.getId()));
        entity.setNome(dto.getNome());
        entity.setCep(dto.getCep());
        entity.setTipo(dto.getTipo());
        return entity;
    }

}
