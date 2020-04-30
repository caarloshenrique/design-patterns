package br.com.state;

public class Executavel {

    public static void main(String[] args) {
        MaquinaRefrigerantes m1 = new MaquinaRefrigerantes(100);
        System.out.println("--------Máquina de refrigerante--------");
        System.out.println("Total refrigerantes: " + m1.getQuantidadeRefrigerantes());
        m1.setEstado(m1.getEstadoSemMoeda());
        m1.inseriuMoeda();
        m1.despejarRefrigerante();
        System.out.println("Refrigerantes restantes: " + m1.getQuantidadeRefrigerantes());
    }
}
