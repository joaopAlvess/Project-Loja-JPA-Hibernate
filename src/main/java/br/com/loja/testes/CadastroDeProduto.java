package br.com.loja.testes;

import br.com.loja.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito bom!");
        celular.setPreco(new BigDecimal("2999"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();        //Isso é o mesmo que a anotação do @Trabnsactional.
        em.persist(celular);
    }
}
