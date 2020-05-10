package br.com.interpreter;

public class Executavel {

    public static void main(String args[]) {
        String str1 = "28 em Binário";
        String str2 = "28 em Hexadecimal";

        Interpretador ec = new Interpretador(new Contexto());
        System.out.println(str1 + " = " + ec.interpretar(str1));
        System.out.println(str2 + " = " + ec.interpretar(str2));

    }
}
