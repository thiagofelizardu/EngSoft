package com.eng;

import java.util.ArrayList;


public class RegistroCrianca {

    private String doenca;
    private String medicacoes;
    public RegistroCrianca(String doenca, String medicacoes) {
        this.doenca = doenca;
        this.medicacoes = medicacoes;
    }
    @Override
    public String toString() {
        return "--Registros da Crianca\n" +
                "doencas: " + doenca + "\n" +
                "medicacoes: " + medicacoes + '\'';
    }
}

