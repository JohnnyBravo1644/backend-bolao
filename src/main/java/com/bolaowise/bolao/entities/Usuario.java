package com.bolaowise.bolao.entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;
    private String senha;
    @Nullable
    private int pontos;
    @Nullable
    @Column(name = "eh_admin",columnDefinition = "BOOLEAN DEFAULT false")
    private Boolean admin;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Nullable
    public Boolean getAdmin() {
        return admin;
    }
    public void setAdmin(@Nullable Boolean admin) {
        this.admin = admin;
    }

    public Usuario() {}

    public Usuario(Long id, String nome, String email, String senha, int pontos, @Nullable Boolean admin) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.pontos = pontos;
        this.admin = admin;
    }
}
