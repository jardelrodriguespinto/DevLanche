package br.com.dev.lanche.teste.enums;

import java.util.stream.Stream;

public enum TipoPagto {

    DEBITO("débito"),
    CREDITO("crédito"),
    AVISTA("à vista"),
    PIX("pix");

    private String tipoPagto;

    TipoPagto(String tipoPagto) {
        this.tipoPagto = tipoPagto;
    }
    public static Stream<TipoPagto> stream() {
        return Stream.of(TipoPagto.values());
    }
}
