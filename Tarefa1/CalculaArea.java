import java.lang.Math;
import java.util.Scanner;

public class CalculaArea {
    static int op;
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

    static public double calcularAreaRetangulo (double lado1, double lado2) throws NumeroNegativoException {
            
            if (lado1 < 0 || lado2 < 0) {
                throw new NumeroNegativoException("Não são permitidos números negativos.");
            }
            return areaRetangulo = lado1 * lado2;
    }
    
    static public double calcularAreaCircunferencia (double raio) throws NumeroNegativoException {
        if (raio < 0) {
            throw new NumeroNegativoException("Não são permitidos números negativos.");
        }
        return areaCircunferencia = Math.pow(raio,2) * Math.PI;
    }
    
    static public double calcularAreaTriangulo (double base, double altura) throws NumeroNegativoException {
        if (base < 0 || altura < 0) {
                throw new NumeroNegativoException("Não são permitidos números negativos.");
            }
        return areaTriangulo = (base * altura) / 2;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("=== MENU ===\n");
        System.out.print("1. Área do retângulo\n");
        System.out.print("2. Área da circunferência\n");
        System.out.print("3. Área do triângulo\n");
        System.out.println("Escolha a opção a ser calculada:");
        op = scanner.nextInt();
        
        switch(op) {
            case 1:
                System.out.println("Insira valor do lado 1:");
                double lado1 = scanner.nextDouble();
        
                System.out.println("Insira valor do lado 2:");
                double lado2 = scanner.nextDouble();
     
                try {
                    System.out.println(calcularAreaRetangulo(lado1, lado2));
                } catch (NumeroNegativoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("Insira valor do raio:");
                double raio = scanner.nextDouble();
    
                try {
                    System.out.println(calcularAreaCircunferencia(raio));
                } catch (NumeroNegativoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 3: 
                System.out.println("Insira valor da base:");
                double base = scanner.nextDouble();
        
                System.out.println("Insira valor da altura:");
                double altura = scanner.nextDouble();
     
                try {
                    System.out.println(calcularAreaTriangulo(base, altura));
                } catch (NumeroNegativoException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
        }
    }
}
