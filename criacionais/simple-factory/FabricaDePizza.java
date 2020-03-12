package simpleFactory;

public final class FabricaDePizza {
    static Pizza p = null;

    public static Pizza criarPizza(String sabor) {
        switch(sabor) {
            case "Calabresa":
                p = new PizzaCalabresa();
                break;
            case "Quatro Queijos":
                p = new PizzaQuatroQueijos();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        return p;
    }
}
