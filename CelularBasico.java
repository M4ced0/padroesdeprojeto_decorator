
package padroesestruturais.decorator;

public class CelularBasico implements Celular {
    private float preco;

    public CelularBasico(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getRecursos() {
        return "Celular Básico";
    }
}
