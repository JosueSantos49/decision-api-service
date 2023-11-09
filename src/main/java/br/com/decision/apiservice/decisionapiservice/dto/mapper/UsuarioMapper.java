package br.com.decision.apiservice.decisionapiservice.dto.mapper;

import org.springframework.stereotype.Component;

import br.com.decision.apiservice.decisionapiservice.dto.UsuarioDTO;
import br.com.decision.apiservice.decisionapiservice.modelo.Usuario;

/*Mapeador*/

@Component
public class UsuarioMapper {
    
    public UsuarioDTO toDTO(Usuario usuario){

        //se for null nao retornar instancia para nao dar nullPointExeption
        if(usuario == null){
            return null;
        }
        return new UsuarioDTO(usuario.getCodigo(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }

    public Usuario toEntity(UsuarioDTO usuarioDTO){

        if(usuarioDTO == null){
            return null;
        }

        Usuario usuario = new Usuario();

        if(usuarioDTO.codigo() != null){
            usuario.setCodigo(usuarioDTO.codigo());
        }
        usuario.setNome(usuarioDTO.nome());
        usuario.setEmail(usuarioDTO.email());
        usuario.setSenha(usuarioDTO.senha());

        return usuario;

    }
}
