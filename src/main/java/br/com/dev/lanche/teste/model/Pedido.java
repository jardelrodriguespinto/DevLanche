package br.com.dev.lanche.teste.model;

import br.com.dev.lanche.teste.enums.StatusPedido;
import br.com.dev.lanche.teste.enums.TipoPagto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido extends BaseEntity {
    @ManyToOne
    private Cliente cliente;
    private String dataPedido;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;
    private BigDecimal total;
    private Long iDdoAtendente;
    @Enumerated(EnumType.STRING)
    private TipoPagto tipoPagto;
    @OneToOne
    private Pagamento pagamento;
}
