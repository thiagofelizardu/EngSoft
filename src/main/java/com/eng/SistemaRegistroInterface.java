package com.eng;

public interface SistemaRegistroInterface {

    void cadastraCri(Crianca crianca);

    Crianca listarRegis(String id)throws CriancaNaoExisteExecption;

}
