package Padrao.Interpreter;

public class Multiplicacao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Multiplicacao(Numero esquerda,
                         Numero direita) {

        x = esquerda.getNumero();
        y = direita.getNumero();
    }

    @Override
    public double interpretar() {
        return x * y;
    }
}
