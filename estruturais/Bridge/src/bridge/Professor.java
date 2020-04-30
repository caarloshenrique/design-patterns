package bridge;

public class Professor implements Servidor {
    
    private Trabalho trabalho;
    
    public Professor(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public void produz() {
        System.out.println("O professor está trabalhando");
        trabalho.trabalhoRealizado();
    }

    @Override
    public void recebeTarefa(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
    
}
