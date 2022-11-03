package com.bolaowise.bolao.DTO;

import com.bolaowise.bolao.entities.Usuario;

import javax.validation.Valid;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private int pontos;

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

    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public UsuarioDTO() {}

    public UsuarioDTO(Long id, String nome, String email, int pontos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pontos = pontos;
    }

    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.pontos = usuario.getPontos();
    }
}
