package com.joaomanoel.model;

import java.math.BigDecimal;

abstract public class Pedido {
    private int idPedido;
     
    public Pedido() {
        this.idPedido = idPedido;          
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " + "\nNumero do Pedido - " + idPedido;
    }

}
