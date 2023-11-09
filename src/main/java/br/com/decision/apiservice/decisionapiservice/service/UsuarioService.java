package br.com.decision.apiservice.decisionapiservice.service;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.decision.apiservice.decisionapiservice.dto.UsuarioDTO;
import br.com.decision.apiservice.decisionapiservice.dto.mapper.UsuarioMapper;
import br.com.decision.apiservice.decisionapiservice.repositorio.UsuarioRepositorio;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Service
@Validated
public class UsuarioService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    private UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepositorio usuarioRepositorio, UsuarioMapper usuarioMapper){
        this.usuarioRepositorio = usuarioRepositorio;
        this.usuarioMapper = usuarioMapper;
    }

    //Agregar valores do objeto em uma lista
    public List<UsuarioDTO> list(){
        return usuarioRepositorio.findAll()
                .stream()
                .map(usuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO criar(@Valid @NotNull UsuarioDTO usuario){
        return usuarioMapper.toDTO(usuarioRepositorio.save(usuarioMapper.toEntity(usuario)));
    }


}
