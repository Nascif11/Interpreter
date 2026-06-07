package Padrao.Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void deveCalcularValorFinalProduto() {

        Produto produto = new Produto();

        produto.setPreco(100);
        produto.setQuantidade(2);

        assertEquals(
                180.0,
                produto.calcularValorFinal()
        );
    }
}
