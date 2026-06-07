package Padrao.Interpreter;

public class Produto {

    private double preco;
    private double quantidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorFinal() {
        return Loja.calcularValorFinal(this.preco, this.quantidade);
    }
}