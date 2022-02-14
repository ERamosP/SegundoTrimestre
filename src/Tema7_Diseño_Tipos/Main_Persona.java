package Tema7_Diseño_Tipos;

import java.util.Scanner;

public class Main_Persona {



    public static void main(String[] args) {

        ClaseMenu.elegirOpcion();




 }
public static double calcularPesoMedio(Persona p1, Persona p2){


        return (p1.getPeso()+p2.getPeso())/2;
}
    public static double calcularAlturaMedia(Persona p1, Persona p2){


        return (p1.getAltura()+p2.getAltura())/2;
    }



}
