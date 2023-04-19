package com.eng;

import java.util.ArrayList;
import java.util.List;

public class SistemaRegistro implements SistemaRegistroInterface {
    private List<Crianca> crianca;

    private List<RegistroCrianca> registroCriancas;

    public SistemaRegistro() {
        this.registroCriancas = new ArrayList<>();
        this.crianca = new ArrayList<>();
    }

    public void cadastraRes(RegistroCrianca novaCrianca) {
        this.registroCriancas.add(novaCrianca);
    }


    public void cadastraCri(Crianca crianca) {
        this.crianca.add(crianca);
    }

    public Crianca listarRegis(String id){
        for(Crianca c: this.crianca){
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }


}
