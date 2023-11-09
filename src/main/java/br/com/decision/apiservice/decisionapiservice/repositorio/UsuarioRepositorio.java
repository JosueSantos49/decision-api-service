package br.com.decision.apiservice.decisionapiservice.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.decision.apiservice.decisionapiservice.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
}
