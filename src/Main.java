import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);

        String opcoes = "Operações permitidas: \n" +
                "\t+ somar\n\t- subtrair\n\t* multiplicar\n\t/ dividir\n\t# encerrar o programa";
        System.out.println(opcoes);

        String opcao;
        float num1;
        float num2;

        while (true) {
            System.out.println("Digite o símbolo da operação desejada:");
            opcao = input.next();

            if (!opcao.equals("#")) {
                System.out.println("Digite o primeiro número:");
                num1 = Float.valueOf(input.next());
                System.out.println("Digite o segundo número:");
                num2 = Float.valueOf(input.next());
                float resultado = 0f;

                switch (opcao){
                    case "+":
                        resultado = calculadora.soma(num1, num2);
                        break;
                    case "-":
                        resultado = calculadora.subtracao(num1, num2);
                        break;
                    case "*":
                        resultado = calculadora.multiplicacao(num1, num2);
                        break;
                    case "/":
                        try{
                            resultado = calculadora.divisao(num1, num2);
                        }catch (ArithmeticException e){
                            System.out.println("Não é possível dividir por 0!");
                            resultado = Float.POSITIVE_INFINITY;
                        }
                        break;
                }

                System.out.println("Resultado: " + resultado + "\n");

            }else {
                break;
            }
        }
    }
}

