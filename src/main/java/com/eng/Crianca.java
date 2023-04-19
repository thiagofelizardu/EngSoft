package com.eng;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Crianca extends RegistroCrianca {
    private String nome;
    private String id;
    private LocalDate dataNascimento;

    public Crianca(String nome, String id,LocalDate dataNascimento,String doenca, String medicacoes) {
        super(doenca, medicacoes);
        this.nome = nome;
        this.id = id;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
