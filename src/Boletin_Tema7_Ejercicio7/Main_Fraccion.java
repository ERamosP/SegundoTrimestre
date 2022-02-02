package Boletin_Tema7_Ejercicio7;


import java.util.Scanner;

public class Main_Fraccion {

            static Scanner sc=new Scanner(System.in);
            public static float pedirNumerador(){
                System.out.println("Introduzca el numerador");
                return sc.nextFloat();
            }

            public static float pedirDenominador() {

                float denominador=0;
                do {
                    System.out.println("Introduzca el valor del denominador");
                    denominador= sc.nextFloat();
                } while (denominador <0);
                return denominador;
            }


    public static void main(String[] args) {



    Fraccion fraccion1=new Fraccion(pedirNumerador(),pedirDenominador());

   // Fraccion fraccion2=new Fraccion(pedirNumerador(),pedirDenominador());

        System.out.println(  fraccion1.dividir(7));






}

}
