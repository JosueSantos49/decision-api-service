package br.com.decision.apiservice.decisionapiservice.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "usuarios")
@Getter
@Setter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String nome;
    
    @Column(length = 200, nullable = false)
    private String email;
    
    @Column(length = 20, nullable = false)
    private String senha;
}
