package br.com.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    // @Column(name = "desc")   Em alguns caso o nome da coluna pode ser diferente do nome do atributo, quando isso acontecer vamos utilizar a seguinte anotação Isso fará com que seja lido o nome da coluna como Desc.
    private String descricao;
    private BigDecimal preco;

}
