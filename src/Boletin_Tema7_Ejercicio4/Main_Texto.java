package Boletin_Tema7_Ejercicio4;

public class Main_Texto {

    public static void main(String[] args) {

        Texto texto1=new Texto(100);

        texto1.setTexto("Hola como estas?");

        texto1.tieneVocal('3');

        System.out.println("Las vocales que contiene son las siguientes "+ texto1.getTexto());
    }
}
