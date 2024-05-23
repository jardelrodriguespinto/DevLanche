package br.com.dev.lanche.teste.model;

import br.com.dev.lanche.teste.enums.TipoPagto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pagamento extends BaseEntity
{
    @OneToOne
    private Pedido pedido;
    private TipoPagto tipoPagto;
    private String valor;
    private Timestamp dataPagamento;
}
