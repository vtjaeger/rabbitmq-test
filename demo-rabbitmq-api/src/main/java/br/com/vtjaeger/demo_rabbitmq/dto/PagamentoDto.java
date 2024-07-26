package br.com.vtjaeger.demo_rabbitmq.dto;

import java.math.BigDecimal;

public class PagamentoDto {
    private String numeroPedido;
    private BigDecimal valor;
    private String produto;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
