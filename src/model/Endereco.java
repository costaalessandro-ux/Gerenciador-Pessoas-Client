package model;

import java.lang.invoke.StringConcatFactory;

public class Endereco {
    private String logradouro;
    private String cep;
    private String cidade;
    private String numero;
    public Endereco(){}
    public Endereco(String logradouro, String cep, String cidade, String numero){
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
    }
    public String getLogradouro() {return logradouro;}
    public String getCep() {return cep;}
    public String getCidade() {return cidade;}
    public String getNumero() {return numero;}
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
}
