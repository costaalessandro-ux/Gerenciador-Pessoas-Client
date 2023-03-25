package model;
public class Pessoa {
    private Long id;
    private String nome;
    private String datanasc;
    public Pessoa(){}
    public Pessoa(Long id, String nome, String datanasc){
        this.id = id;
        this.nome = nome;
        this.datanasc = datanasc;
    }
    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getDatanasc(){
        return datanasc;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDatanasc(String datanasc){
        this.datanasc = datanasc;
    }
}
