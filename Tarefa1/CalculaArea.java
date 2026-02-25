import java.lang.Math;
import java.util.Scanner;

public class CalculaArea {
    static double lado1;
    static int lado2;
    static double raio;
    static double base;
    static double altura;
    static double areaRetangulo;
    static double areaCircunferencia;
    static double areaTriangulo;
    
    static class NumeroNegativoException extends Exception {
        public NumeroNegativoException(String mensagem) {
            super(mensagem);
        }
    }

    static public void calcularAreaRetangulo (double lado1, double lado2) {
        if (lado1 < 0 || lado2 < 0) {
            throws NumeroNegativoException("Não são permitidos números negativos.");
        } else {
            areaRetangulo = lado1 * lado2;
        }
        
    }
    
    static public void calcularAreaCircunferencia (double raio) {
        areaCircunferencia = Math.pow(raio,2) * Math.PI;
    }
    
    static public void calcularAreaTriangulo (double base, double altura) {
        areaTriangulo = (base * altura)/2;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira valor do lado 1:");
        double lado1 = scanner.nextDouble();

        System.out.println("Insira valor do lado 2:");
        double lado2 = scanner.nextDouble();
    }
}
