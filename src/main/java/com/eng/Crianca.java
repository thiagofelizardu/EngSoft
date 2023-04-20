package com.eng;
public class Crianca extends RegistroCrianca {
    private String nome;
    private String id;
    private Object sexoCria;
    private String dataNascimento;
    public Crianca(String nome, String id, Object sexoCria, String dataNascimento, String doenca, String medicacoes) {
        super(doenca, medicacoes);
        this.nome = nome;
        this.id = id;
        this.sexoCria = sexoCria;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() {
        return nome;
    }
    public String getId() {
        return id;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public Object getSexoCria() {
        return sexoCria;
    }
}
