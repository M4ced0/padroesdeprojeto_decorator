
package padroesestruturais.decorator;

public class Conectividade5G extends CelularDecorator {
    public Conectividade5G(Celular celular) {
        super(celular);
    }

    public float getPreco() {
        return super.getPreco() + 300.0f;
    }

    public String getRecursos() {
        return super.getRecursos() + "/5G";
    }
}
