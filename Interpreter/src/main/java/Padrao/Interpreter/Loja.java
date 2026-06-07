package Padrao.Interpreter;

public class Loja {

    public static String formula = "preco * quantidade - 20";

    public static double calcularValorFinal(double preco, double quantidade) {

        String expressao;

        expressao = formula.replace("preco",
                Double.toString(preco));

        expressao = expressao.replace("quantidade",
                Double.toString(quantidade));

        InterpretadorExpressao interpretador =
                new InterpretadorExpressoesAritmeticas(expressao);

        return interpretador.interpretar();
    }
}
