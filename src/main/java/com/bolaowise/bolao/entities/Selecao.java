package com.bolaowise.bolao.entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "selecoes")
public class Selecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String pais;

    @Nullable
    @Column(name = "jogos_ganhos")
    private int jogosGanhos;

    @NotBlank
    private String grupo;

    @Column(columnDefinition = "BOOLEAN DEFAULT false")
    private Boolean classificado;

    public Selecao() {}

    public Selecao(Long id, String pais, int jogosGanhos, String grupo, Boolean classificado) {
        this.id = id;
        this.pais = pais;
        this.jogosGanhos = jogosGanhos;
        this.grupo = grupo;
        this.classificado = classificado;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getJogosGanhos() {
        return jogosGanhos;
    }
    public void setJogosGanhos(int jogosGanhos) {
        this.jogosGanhos = jogosGanhos;
    }

    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Boolean getClassificado() {
        return classificado;
    }
    public void setClassificado(Boolean classificado) {
        this.classificado = classificado;
    }
}
