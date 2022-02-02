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

    /**
     * creamos un metodo constructor sin paramentro de entrada, en el cual controlaremos que si el
     *      * denominador vale 0, pase a valer 1
     */
    public Fraccion() {
        pedirNumerador();
        pedirDenominador();

        if(getDenominador()==0){
            this.denominador = 1;
        }
        this.denominador = getDenominador();
        simplificar(this.numerador,this.denominador);
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
    /*
     Se crearán métodos para simplificar la fracción,
 * multiplicarla y dividirla por un número y por una fracción e invertirle el signo.
 * Para simplificar la fracción ayudaros del método Math.min que devuelve el mínimo de dos
 * números (el tipo devuelto es el mismo tipo de los números que compara)
     */
    public void pedirNumerador(){
        System.out.println("Introduzca el numerador");
        setNumerador(sc.nextInt());  }

    public void pedirDenominador() {
        do {
            System.out.println("Introduzca el valor del denominador");
            setDenominador(sc.nextInt());
        } while (getDenominador() == 0);
    }


    public int simplificar(int numerador, int denominador){

       int fraccion=Math.min(this.numerador,this.denominador);
        return fraccion;
    }

    /**
     * lo que se pretende en esta funcion es que si el numerador es menor de el denominador, se inviertan los
     * numeros para poder lleva a cabo las operciones petinentes
     */
    public void invertirFraccion(){

        if (this.numerador<this.denominador){
            int aux=this.numerador;
            this.numerador=this.denominador;
            this.denominador=aux;
        }


    }

    /**
     * este metodo sirve para hacer la multiplicacion de la fraccion por un unico numero
     * introducimos el metodo pedir datos porque al hacer la llamada desde el main, a traves de la introduccion de este metodo,
     * los valores del numerador y del denominador los pide el metodo y se almacenan en él, hacemos una if don el
     * metodo de invertir datos y si se cumple o no esa funcion, continua y tiene la devolucion de un numero entero
     * @param numUnico
     * @return devuelve el resultado de la multiplicacion de la fraccion por el numero introducido por parametros
     */
    public int multiplicar(int numUnico){


        invertirFraccion();
        int num1=numUnico;
        numerador=this.getNumerador();
        denominador=this.getDenominador();

        return (numerador/denominador)*num1;

    }

    /**
     * aqui se pretende hacer una multiplicacion entre dos fracciones haremos la llamada al metodo de pedir los datos
     * para almacenar los valores de los numeradores y denominadores dentro de la funcion, sin tener que pasarle
     * paramatros

     */
    public void multiplicarFraccion(Fraccion fraccion){

       numerador=this.numerador;
       denominador=this.denominador;

        System.out.println("El resultado de la multiplicacion de las fracciones es:" );

    }

    private int mcd(){
         this.numerador = Math.abs(this.numerador);
         this.denominador = Math.abs(this.denominador);
        if(this.denominador == 0){
            return  this.numerador;
        }
        int resto;
        while(this.denominador != 0){
            resto = this.numerador % this.denominador;
            this.numerador = this.denominador;
            this.denominador = resto;
        }
        return this.denominador;
    }


    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + this.numerador +
                ", denominador=" + this.denominador +
                '}';
    }


}
