package br.com.dev.lanche.teste.enums;

import java.util.stream.Stream;

public enum StatusPedido {
    PENDENTE("pendente"),
    PREPARO("em preparação"),
    PRONTO("pronto"),
    ENTREGUE("entregue");

    private String statusPedido;

    StatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
    public static Stream<StatusPedido> stream() {
        return Stream.of(StatusPedido.values());
    }
}
