package com.bolaowise.bolao.entities;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "partida")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "competidor_1_id")
    private Selecao competidor1;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "competidor_2_id")
    private Selecao competidor2;

    @NotNull
    private Date data;

    @Column(nullable = true)
    private int vencedor;

    public Partida() {}

    public Partida(Long id, Selecao competidor1, Selecao competidor2, Date data, int vencedor) {
        this.id = id;
        this.competidor1 = competidor1;
        this.competidor2 = competidor2;
        this.data = data;
        this.vencedor = vencedor;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Selecao getCompetidor1() {
        return competidor1;
    }
    public void setCompetidor1(Selecao competidor1) {
        this.competidor1 = competidor1;
    }

    public Selecao getCompetidor2() {
        return competidor2;
    }
    public void setCompetidor2(Selecao competidor2) {
        this.competidor2 = competidor2;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public int getVencedor() {
        return vencedor;
    }
    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }
}
