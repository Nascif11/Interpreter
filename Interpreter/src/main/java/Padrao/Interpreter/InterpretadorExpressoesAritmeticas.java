package Padrao.Interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressoesAritmeticas
        implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressoesAritmeticas(String contexto) {

        Stack<InterpretadorExpressao> pilhaInterpretadores =
                new Stack<>();

        List<String> elementos =
                Arrays.asList(contexto.split(" "));

        Iterator<String> iterator =
                elementos.iterator();

        while (iterator.hasNext()) {

            String elemento = iterator.next();

            if (elemento.matches("\\d+(\\.\\d*)?")) {

                pilhaInterpretadores.push(
                        new Numero(
                                Double.parseDouble(elemento)
                        )
                );

            } else if (elemento.equals("+")) {

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(iterator.next())
                        );

                Adicao adicao =
                        new Adicao(esquerda, direita);

                pilhaInterpretadores.push(
                        new Numero(adicao.interpretar())
                );

            } else if (elemento.equals("-")) {

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(iterator.next())
                        );

                Subtracao subtracao =
                        new Subtracao(esquerda, direita);

                pilhaInterpretadores.push(
                        new Numero(subtracao.interpretar())
                );

            } else if (elemento.equals("*")) {

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(iterator.next())
                        );

                Multiplicacao multiplicacao =
                        new Multiplicacao(esquerda, direita);

                pilhaInterpretadores.push(
                        new Numero(multiplicacao.interpretar())
                );

            } else if (elemento.equals("/")) {

                Numero esquerda =
                        (Numero) pilhaInterpretadores.pop();

                Numero direita =
                        new Numero(
                                Double.parseDouble(iterator.next())
                        );

                Divisao divisao =
                        new Divisao(esquerda, direita);

                pilhaInterpretadores.push(
                        new Numero(divisao.interpretar())
                );

            } else {

                throw new IllegalArgumentException(
                        "Expressão inválida"
                );
            }
        }

        interpretadorInicial =
                pilhaInterpretadores.pop();
    }

    @Override
    public double interpretar() {
        return interpretadorInicial.interpretar();
    }
}