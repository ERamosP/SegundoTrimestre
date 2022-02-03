package Boletin_Tema7_Ejercicio7;


import java.util.Scanner;

/**
 * Ejercicio 7.- Crea la clase Fracción. Los atributos, en principio, serán numerador y denominador.
 * El numerador y denominador se introducirán por pantalla. No es necesario usar Try pero sí
 * controlar que el denominador no sea negativo.
 */
public class Fraccion {

        static Scanner sc=new Scanner(System.in);
        private int numerador;
        private int denominador;

        public Fraccion(){
            this.numerador=1;
            this.denominador=1;
        }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }



     public float multiplicar(int numUnico) {

         return this.numerador / this.denominador * numUnico;

     }
         public Fraccion multiplicarFraccion (Fraccion fraccion){

            Fraccion f=new Fraccion();
            f.numerador=this.numerador* fraccion.numerador;
;            f.denominador=this.denominador* fraccion.denominador;

             return f;

         }

    /**
     * llamamos a la clase fraccion, sin parametros y como estan inicializadas en 1,
     * le asignamos el valor de los parametros introducidos por consola, en este caso es el this.num
     * this.den
     * @param num
     * @return
     */
         public Fraccion dividir ( int num){

            Fraccion fraccion = new Fraccion();

            fraccion.numerador=this.denominador;
            fraccion.denominador=this.denominador*num;
                return fraccion;
         }

    /**
     * pretendemos realizar la division de dos fracciones pasandolo por parametros la fraccion
     * @param fraccion
     * @return
     */
    public Fraccion dividirFraccion (Fraccion fraccion){

             Fraccion f = new Fraccion();

             f.numerador=this.numerador* fraccion.denominador;
             f.denominador=this.denominador * fraccion.numerador;

             return f;

         }
         @Override
         public String toString () {

             return this.numerador + "/" + this.denominador;
         }

     }
