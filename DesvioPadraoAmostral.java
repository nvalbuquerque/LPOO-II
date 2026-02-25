import java.lang.Math;

public class DesvioPadraoAmostral {
    static private double soma;
    static private int cont;
    static private double desvio;
    static private double somaQuadrado;
    static private double quadradoSoma;
    static private double[] valor = new double[10];
    static double desvioPadrao;
    
    static public void adicionarValor (double valor) {
        soma += valor;
        cont++;
    }
    
    static public void calculaQuadrado (double valor) {
        somaQuadrado += Math.pow(valor,2);
    }
    
    public static void main(String args[]) {
        double[] valor = {1.58, 1.72, 1.65, 1.80, 1.74, 1.69, 1.83, 1.60, 1.77, 1.68};
        
        int i;
        
        for (i = 0; i < valor.length; i++) {
            adicionarValor(valor[i]);
            calculaQuadrado(valor[i]);
        }
                
        quadradoSoma = Math.pow(soma, 2);
        
        desvioPadrao = Math.sqrt((somaQuadrado - (quadradoSoma / cont)) / (cont - 1));
        
        System.out.printf("Desvio padrão amostral: %4f", desvioPadrao);
        
    }
}
