public class Calculadora {

    public float soma(float num1, float num2) {
        return num1 + num2;
    }

    public float subtracao(float num1, float num2){
        return num1 - num2;
    }

    public float divisao(float num1, float num2){
        if (num2 == 0){
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    public float multiplicacao(float num1, float num2){
        return num1 - num2;
    }
}
