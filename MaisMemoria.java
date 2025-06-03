
package padroesestruturais.decorator;

public class MaisMemoria extends CelularDecorator {
    public MaisMemoria(Celular celular) {
        super(celular);
    }

    public float getPreco() {
        return super.getPreco() + 150.0f;
    }

    public String getRecursos() {
        return super.getRecursos() + "/Memória Extra";
    }
}
