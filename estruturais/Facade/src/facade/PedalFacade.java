package facade;

public class PedalFacade {
   
    private final ServoFreio servo;
    private final CilindroMestre cilindro;
    private final Pastilhas pastilhas;

    public PedalFacade() {
        this.servo = new ServoFreio();
        this.cilindro = new CilindroMestre();
        this.pastilhas = new Pastilhas();
    }
    
    public void frear() {
        this.servo.transmiteForca();
        this.cilindro.abasteceSistema();
        this.frear();
    }
    
}
