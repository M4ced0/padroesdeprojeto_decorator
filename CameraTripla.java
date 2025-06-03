
package padroesestruturais.decorator;

public class CameraTripla extends CelularDecorator {
    public CameraTripla(Celular celular) {
        super(celular);
    }

    public float getPreco() {
        return super.getPreco() + 500.0f;
    }

    public String getRecursos() {
        return super.getRecursos() + "/Câmera Tripla";
    }
}
