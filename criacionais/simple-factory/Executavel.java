package simpleFactory;

import javax.swing.JOptionPane;

public class Executavel {
    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog("Digite o sabor escolhido");
        FabricaDePizza.criarPizza(escolha).entregaPizza(escolha);
    }
}
