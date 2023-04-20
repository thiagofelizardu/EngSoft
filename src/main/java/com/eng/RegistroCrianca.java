package com.eng;
public class RegistroCrianca {
    private String doenca;
    private String medicacoes;
    public RegistroCrianca(String doenca, String medicacoes) {
        this.doenca = doenca;
        this.medicacoes = medicacoes;
    }
    @Override
    public String toString() {
        return "Doencas: " + doenca + "\n" + "Medicacoes: " + medicacoes;
    }
}