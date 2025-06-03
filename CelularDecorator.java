
package padroesestruturais.decorator;

public abstract class CelularDecorator implements Celular {
    protected Celular celular;

    public CelularDecorator(Celular celular) {
        this.celular = celular;
    }

    public float getPreco() {
        return celular.getPreco();
    }

    public String getRecursos() {
        return celular.getRecursos();
    }
}
