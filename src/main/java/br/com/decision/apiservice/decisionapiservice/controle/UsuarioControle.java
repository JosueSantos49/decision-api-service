package br.com.decision.apiservice.decisionapiservice.controle;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.decision.apiservice.decisionapiservice.dto.UsuarioDTO;
import br.com.decision.apiservice.decisionapiservice.service.UsuarioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/api")
public class UsuarioControle {
    
    private UsuarioService usuarioService;

    public UsuarioControle(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/list-usuarios")
    public @ResponseBody List<UsuarioDTO> selecionar(){
        return usuarioService.list();
    }

    @PostMapping("/criar-usuario")
    public UsuarioDTO criar(@RequestBody @Valid @NotNull UsuarioDTO usuario){
        return usuarioService.criar(usuario);
    }

}
