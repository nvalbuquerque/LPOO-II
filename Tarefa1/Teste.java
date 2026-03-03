import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Teste {
    @Test
    void testeAreaRetanguloPositivo () {
        assertEquals(12, CalculaArea.calcularAreaRetangulo(3,4));
    }
    
    @Test
    void testeAreaRetanguloNegativo () {
        assertThrows(NumberFormatException.class, () -> {
            CalculaArea.calcularAreaRetangulo(-2,-2);
        });
    }
    
    @Test
    void testeAreaCirculoPositivo () {
        assertEquals(50.265, CalculaArea.calcularAreaCircunferencia(4));
    }
    
    @Test
    void testeAreaCirculoNegativo () {
        assertThrows(NumberFormatException.class, () -> {
            CalculaArea.calcularAreaCircunferencia(-2);
        });
    }

    @Test
    void testeAreaTrianguloPositivo () {
        assertEquals(6, CalculaArea.calcularAreaTriangulo(3,4));
    }
    
    @Test
    void testeAreaTrianguloNegativo () {
        assertThrows(NumberFormatException.class, () -> {
            CalculaArea.calcularAreaTriangulo(-2,-2);
        });
    }
}