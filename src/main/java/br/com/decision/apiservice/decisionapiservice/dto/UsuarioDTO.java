package br.com.decision.apiservice.decisionapiservice.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDTO (    
    Long codigo,
    @NotBlank @NotNull @Length(min = 3, max = 50) String nome,
    @NotNull String email,
    @NotNull @Length(min = 6, max = 20) String senha) {
}
