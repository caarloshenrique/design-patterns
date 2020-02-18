package singleton;

public class Singleton {

    public static void main(String[] args) {
        Carro c;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            c = Carro.getInstancia();
            c.setModelo("Teste");
            System.out.println(c);
        }

    }

}
