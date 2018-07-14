package com.joaomanoel.model;

public class Produto extends Pedido{
    private String descricao;
    private double quantidade;
    private double valorUnitario;
    private double valorTotal;
    
    public Produto(){
        super();
        this.setDescricao("PADRÃO");
        this.setQuantidade(0);
        this.setValorUnitario(0.1);
        this.setValorTotal(0.1);
    }
           
    public Produto(String descricao, double quantidade, double valorUnitario, double valorTotal){
        this.setDescricao("PADRÃO");
        this.setQuantidade(quantidade);
        this.setValorUnitario(valorUnitario);
        this.setValorTotal(valorTotal);
    }    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        this.descricao = descricao.trim().isEmpty()?"PADRÃO":descricao.toUpperCase();
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
        this.quantidade = quantidade < 0.0001 ? 0.0001 : quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
        this.valorUnitario = valorUnitario < 0.0001 ? 0.0001 : valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
        this.valorTotal = valorTotal < 0.0001 ? 0.0001 : valorTotal;
    }
}
