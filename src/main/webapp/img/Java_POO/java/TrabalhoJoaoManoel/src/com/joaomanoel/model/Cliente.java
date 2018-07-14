package com.joaomanoel.model;

public class Cliente extends Pedido{
    private String nome;
    private String documento;
    private String telefone;
    
    public Cliente(){
        super();
        this.setNome("PADRÃO");
        this.setDocumento("PADRÃO");
        this.setTelefone("PADRÃO");            
    }
    public Cliente(String nome, String documento, String telefone){
        this.setNome("PADRÃO");
        this.setDocumento("PADRÃO");
        this.setTelefone("PADRÃO");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
