package br.com.dev.lanche.teste.model;

import jakarta.persistence.Entity;
import lombok.*;

/*/
* REfazer a lógica desta classe isto na rreal não deve ser uma entidade por sí só
* 
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Estoque extends BaseEntity {
    private Long iDdoProduto;
    private String quantidadeAtual;
}
