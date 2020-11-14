import eta.TestETA;

public class TestCalculadora extends TestETA {
    private Calculadora calculadora;

    @Override
    public void setup() {
        calculadora = new Calculadora();
    }

    @Override
    public void finalize() {

    }

    public void testSomaPositivos(){
        assertEquals(calculadora.soma(3,3),6);
    }

    public void testSomaNegativos(){
        assertEquals(calculadora.soma(-3,-3),-6);
    }

    public void testSomaFracionados(){
        assertEquals(calculadora.soma(3.8f,3.2f),7);
    }

    public void testSubtracaoPositivos(){
        assertEquals(calculadora.subtracao(3,3),0);
    }

    public void testSubtracaoNegativos(){
        assertEquals(calculadora.subtracao(-3,-3),0);
    }

    public void testSubtracaoFracionados(){
        assertEquals(calculadora.subtracao(5.0f,3.2f),1.8f);
    }

    public void testMultiplicacaoPositivos(){
        assertEquals(calculadora.multiplicacao(3,3),9);
    }

    public void testMultiplicacaoNegativos(){
        assertEquals(calculadora.multiplicacao(-3,-3),9);
    }

    public void testMultiplicacaoFracionados(){
        assertEquals(calculadora.multiplicacao(1.0f,3.2f),3.2f);
    }

    public void testDivisaoPositivos(){
        assertEquals(calculadora.divisao(3,3),1);
    }

    public void testDivisaoNegativos(){
        assertEquals(calculadora.divisao(-3,-3),1);
    }

    public void testDivisaoFracionados(){
        assertEquals(calculadora.divisao(5.0f,5.0f),1);
    }

    public void testDivisaoPorZero(){
        try{
            calculadora.divisao(5f,0f);
            fail("Failed");
        }catch (ArithmeticException e){
            sucess("Passed");
        }

    }

    public static void main(String[] args) {
        TestCalculadora testCalculadora = new TestCalculadora();
        testCalculadora.run();
    }
}
