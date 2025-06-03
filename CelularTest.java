
package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CelularTest {

    @Test
    void deveRetornarPrecoCelularBasico() {
        Celular celular = new CelularBasico(1000.0f);
        assertEquals(1000.0f, celular.getPreco());
    }

    @Test
    void deveRetornarPrecoCelularCom5G() {
        Celular celular = new Conectividade5G(new CelularBasico(1000.0f));
        assertEquals(1300.0f, celular.getPreco());
    }

    @Test
    void deveRetornarPrecoCelularComTodosRecursos() {
        Celular celular = new ProtecaoAgua(new MaisMemoria(new Conectividade5G(new CameraTripla(new CelularBasico(1000.0f)))));
        assertEquals(2150.0f, celular.getPreco());
    }

    @Test
    void deveRetornarRecursosCelularComTodos() {
        Celular celular = new ProtecaoAgua(new MaisMemoria(new Conectividade5G(new CameraTripla(new CelularBasico(1000.0f)))));
        assertEquals("Celular Básico/Câmera Tripla/5G/Memória Extra/Proteção à Água", celular.getRecursos());
    }

    @Test
    void deveRetornarRecursosCelularCom5GEMemoria() {
        Celular celular = new MaisMemoria(new Conectividade5G(new CelularBasico(1000.0f)));
        assertEquals("Celular Básico/5G/Memória Extra", celular.getRecursos());
    }
}
