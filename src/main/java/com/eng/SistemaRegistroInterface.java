package com.eng;

public interface SistemaRegistroInterface {

    void cadastraRes(RegistroCrianca novaCrianca);

    void cadastraCri(Crianca crianca);

    Crianca listarRegis(String id);


}
