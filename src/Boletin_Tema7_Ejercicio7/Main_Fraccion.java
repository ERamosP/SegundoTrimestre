package Boletin_Tema7_Ejercicio7;

import java.util.Scanner;

public class Main_Fraccion {

    public static void main(String[] args) {


    Fraccion fraccion1=new Fraccion();

    Scanner sc=new Scanner(System.in);


        System.out.println("Introduzca el numerador");
        fraccion1.setNumerador(sc.nextFloat());
        do {
            System.out.println("Introduzca el valor del denominador");
            fraccion1.setDenominador(sc.nextFloat());
        }while (fraccion1.getDenominador()<0);

       // fraccion1.simplificar();
        System.out.println("La fraccion simplificada es "+ fraccion1.simplificar(fraccion1.getNumerador(), fraccion1.getDenominador()));
}

}
