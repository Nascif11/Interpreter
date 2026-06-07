package Padrao.Interpreter;

public class Adicao implements InterpretadorExpressao {

    private double x;
    private double y;

    public Adicao(Numero esquerda,
                  Numero direita) {

        x = esquerda.getNumero();
        y = direita.getNumero();
    }

    @Override
    public double interpretar() {
        return x + y;
    }
}
