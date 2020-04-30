package bridge;

public class Coordenador implements Servidor{

    private Trabalho trabalho;
    
    Coordenador(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public void produz() {
        System.out.println("O coordenador está trabalhando");
        trabalho.trabalhoRealizado();
    }

    @Override
    public void recebeTarefa(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
    
}
