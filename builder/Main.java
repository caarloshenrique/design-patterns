package builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(10)
                .queijo()
                .tomate()
                .bacon()
                .criarPizza();
        System.out.println(pizza);
    }
}
