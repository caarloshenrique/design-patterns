package bridge;

public class Executavel {
    public static void main(String[] args) {
        
        Trabalho trabalhoProfessor = new MinistrarAula();
        final Servidor professor = new Professor(trabalhoProfessor);
        professor.produz();
        
        trabalhoProfessor = new ElaborarProva();
        professor.recebeTarefa(trabalhoProfessor);
        professor.produz();
        
        trabalhoProfessor = new CriarTurmas();
        professor.recebeTarefa(trabalhoProfessor);
        professor.produz();
        
        Trabalho trabalhoCoordenador = new FazerMatricula();
        final Servidor coordenador = new Coordenador(trabalhoCoordenador);
        coordenador.produz();
        
        trabalhoCoordenador = new MinistrarAula();
        coordenador.recebeTarefa(trabalhoCoordenador);
        coordenador.produz();
    }
}
