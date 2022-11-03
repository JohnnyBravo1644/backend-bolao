package com.bolaowise.bolao.DTO;

import com.bolaowise.bolao.entities.Selecao;

public class SelecaoDTO {

    private Long id;
    private String pais;
    private int jogosGanhos;

    public SelecaoDTO() {}

    public SelecaoDTO(Long id, String pais, int jogosGanhos) {
        this.id = id;
        this.pais = pais;
        this.jogosGanhos = jogosGanhos;
    }

    public SelecaoDTO(Selecao selecao) {
        this.id = selecao.getId();
        this.pais = selecao.getPais();
        this.jogosGanhos = selecao.getJogosGanhos();
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
}
