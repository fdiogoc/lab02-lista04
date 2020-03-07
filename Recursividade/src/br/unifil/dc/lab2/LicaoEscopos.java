package br.unifil.dc.lab2;

public class LicaoEscopos {
    private static void testeTiposCompostosReferencia() {
        IntegerLab2 investimentos = new IntegerLab2(1000);
        renderDuasVezesLab2(investimentos);
        System.out.println("Você agora tem " + investimentos.getValor());
    }

    public static void renderDuasVezesLab2(IntegerLab2 investimentos) {
        investimentos.setValor(investimentos.getValor()* 2);
    }



    private static void testeInvestimentosPrimitivo() {
        int investimentos = 1000;
        renderDuasVezes(investimentos);
        System.out.println("Total após investimento é " + investimentos);
    }

    public static int renderDuasVezes(int investimentos) {
        investimentos = investimentos * 2;
        return investimentos;
    }
}

class IntegerLab2 {
    public IntegerLab2(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private int valor;
}
