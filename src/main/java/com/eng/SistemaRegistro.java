package com.eng;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaRegistro implements SistemaRegistroInterface {
    private List<Crianca> crianca;

    private List<RegistroCrianca> registroCriancas;

    public SistemaRegistro() {
        this.registroCriancas = new ArrayList<>();
        this.crianca = new ArrayList<>();
    }


    public void cadastraCri(Crianca crianca) {
        this.crianca.add(crianca);
    }

    public Crianca listarRegis(String id) throws CriancaNaoExisteExecption {
        for(Crianca c: this.crianca){
            if (c.getId().equals(id))
                return c;
        }
        throw new CriancaNaoExisteExecption("Não Existe Criança com esse ID!");
    }

        
}

