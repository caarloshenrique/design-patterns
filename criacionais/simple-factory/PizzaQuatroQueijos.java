package simpleFactory;

public class PizzaQuatroQueijos implements Pizza {

    @Override
    public void entregaPizza(String sabor) {
        System.out.println("Pizza de " +sabor+" pronta.");
    }
    
}
