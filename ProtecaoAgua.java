
package padroesestruturais.decorator;

public class ProtecaoAgua extends CelularDecorator {
    public ProtecaoAgua(Celular celular) {
        super(celular);
    }

    public float getPreco() {
        return super.getPreco() + 200.0f;
    }

    public String getRecursos() {
        return super.getRecursos() + "/Proteção à Água";
    }
}
