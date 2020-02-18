package singleton;

public class Carro {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + '}';
    }

    private Carro() {
    }

    private static Carro instancia = null;

    public static synchronized Carro getInstancia() {
        if (instancia == null) {
            instancia = new Carro();
            System.out.println("Instancia Criada ...");
        }
        return instancia;
    }
}
