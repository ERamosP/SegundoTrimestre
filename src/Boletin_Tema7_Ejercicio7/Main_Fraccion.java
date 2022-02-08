package Boletin_Tema7_Ejercicio7;


import java.util.Scanner;

public class Main_Fraccion {

            static Scanner sc=new Scanner(System.in);
            public static int pedirNumerador(){
                System.out.println("Introduzca el numerador");
                return sc.nextInt();
            }

            public static int pedirDenominador() {

                int denominador=0;
                do {
                    System.out.println("Introduzca el valor del denominador");
                    denominador= sc.nextInt();
                } while (denominador <0);
                return denominador;
            }


    public static void main(String[] args) {



    Fraccion fraccion1=new Fraccion(pedirNumerador(),pedirDenominador());

    Fraccion fraccion2=new Fraccion(pedirNumerador(),pedirDenominador());

    fraccion1.dividir(7);
    fraccion2.dividirFraccion(fraccion1);

    fraccion1.multiplicar(8);
    fraccion2.multiplicarFraccion(fraccion1);







}

}
