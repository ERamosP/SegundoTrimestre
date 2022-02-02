package Boletin_Tema7_Ejercicio7;


import java.util.Scanner;

/**
 * Ejercicio 7.- Crea la clase Fracción. Los atributos, en principio, serán numerador y denominador.
 * El numerador y denominador se introducirán por pantalla. No es necesario usar Try pero sí
 * controlar que el denominador no sea negativo.
 */
public class Fraccion {

        static Scanner sc=new Scanner(System.in);
        private float numerador;
        private float denominador;

        public Fraccion(){
            this.numerador=1;
            this.denominador=1;
        }

    public Fraccion(float numerador, float denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }



     public float multiplicar(int numUnico) {

         return this.numerador / this.denominador * numUnico;

     }
         public float multiplicarFraccion (Fraccion fraccion){

             return (this.numerador * fraccion.numerador) / (this.denominador * fraccion.denominador);

         }

    /**
     * llamamos a la clase fraccion, sin parametros y como estan inicializadas en 1,
     * le asignamos el valor de los parametros introducidos por consola, en este caso es el this.num
     * this.den
     * @param num
     * @return
     */
         public Fraccion dividir ( float num){

            Fraccion fraccion = new Fraccion();

            fraccion.numerador=this.denominador;
            fraccion.denominador=this.denominador*num;
                return fraccion;
         }

         public float dividirFraccion (Fraccion fraccion){


             return (this.numerador * fraccion.denominador) / (this.denominador * fraccion.numerador);

         }
         @Override
         public String toString () {

             return this.numerador + "/" + this.denominador;
         }

     }
