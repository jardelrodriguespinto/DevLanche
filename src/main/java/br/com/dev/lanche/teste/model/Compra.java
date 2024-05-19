package br.com.dev.lanche.teste.model;

import br.com.dev.lanche.teste.enums.TipoPagto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Compra extends BaseEntity{
    private BigDecimal valor;
    private TipoPagto tipoPagto;
    @ManyToMany(mappedBy = "compras")
    private Set<Fornecedor> fornecedores;

    public void addFornecedor(Fornecedor fornecedor){
        if (fornecedores == null)
            fornecedores = new HashSet<>();

        fornecedores.add(fornecedor);
    }
}
