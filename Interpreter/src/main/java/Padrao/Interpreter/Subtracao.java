package Padrao.Interpreter;

public class Subtracao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Subtracao(Numero esquerda,
                     Numero direita) {

        x = esquerda.getNumero();
        y = direita.getNumero();
    }

    @Override
    public double interpretar() {
        return x - y;
    }
}
