package Padrao.Interpreter;

public class Divisao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Divisao(Numero esquerda,
                   Numero direita) {

        x = esquerda.getNumero();
        y = direita.getNumero();
    }

    @Override
    public double interpretar() {
        return x / y;
    }
}
