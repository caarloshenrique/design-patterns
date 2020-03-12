package prototype;

public class Executavel {
    public static void main(String[] args) throws CloneNotSupportedException {
        Carreta scania = new Scania("Jacaré");
        scania.preco = 100000;
        
        Carreta volvo = new Volvo("EDC");
        volvo.preco = 150000;
        
        Carreta x;
        
        x = (Scania) scania.clone();
        
        System.out.println("A carreta " + x.modelo + " custa " + x.preco);
    }
}
