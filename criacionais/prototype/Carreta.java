package prototype;

public abstract class Carreta implements Cloneable {
    protected String modelo;
    protected int preco;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
