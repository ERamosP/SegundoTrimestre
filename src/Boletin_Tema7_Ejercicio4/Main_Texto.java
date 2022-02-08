package Boletin_Tema7_Ejercicio4;

public class Main_Texto {

    public static void main(String[] args) {

        Texto texto1 = new Texto(30);



        texto1.añadirCaracterInicio("Hace");
        texto1.añadirCaracterFinal("frio");
        System.out.println("El texto tiene "+texto1.contarVocales()+" vocales");
    }
}
