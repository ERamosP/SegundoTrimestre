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
     * metodo construcctor con valores inicializados a uno para poder ser llamados en los metodos
     */
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


    /**
     * metodo para multiplicar la fraccion por un unico numero
     * @param numUnico
     * @return
     */
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
     * pretendemos realizar la division de dos fracciones pasandolas por parametros la fraccion
     * @param fraccion
     * @return
     */
    public Fraccion dividirFraccion (Fraccion fraccion){

             Fraccion f = new Fraccion();

             f.numerador=this.numerador* fraccion.denominador;
             f.denominador=this.denominador * fraccion.numerador;

             return f;
    }
    private int maximoComunDivisor (){
        int numer = Math.abs(this.numerador);
        int denom = Math.abs(this.denominador);
        int temp;
        if (denom == 0){
            return numer;
        }
        while (denom != 0){
            temp = numer%denom;
            numer = denom;
            denom = temp;
        }return numer;
    }

    public void simplificar (){
        int mcd = maximoComunDivisor();
        this.numerador = this.numerador/mcd;
        this.denominador = this.denominador/mcd;
    }
         @Override
         public String toString () {

             return this.numerador + "/" + this.denominador;
         }
/*
public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void dibujarFraccion (){
        System.out.println("La fraccion es " + this.numerador + "/" + this.denominador);
    }

    private int maximoComunDivisor (){
        int numer = Math.abs(this.numerador);
        int denom = Math.abs(this.denominador);
        int temp;
        if (denom == 0){
            return numer;
        }
        while (denom != 0){
            temp = numer%denom;
            numer = denom;
            denom = temp;
        }return numer;
    }

    public void simplificar (){
        int mcd = maximoComunDivisor();
        this.numerador = this.numerador/mcd;
        this.denominador = this.denominador/mcd;
        dibujarFraccion();
    }

    public void multiplicar (double num){
        this.numerador=num;
        simplificar();
        dibujarFraccion();
    }

    public void dividir (double num){
        this.denominador/=num;
        simplificar();
        dibujarFraccion();
    }

    public void multiplicarFraccion (Fraccion fraccion){
        this.numerador=fraccion.numerador;
        this.denominador=fraccion.denominador;
        simplificar();
        dibujarFraccion();
    }

    public void dividirFraccion (Fraccion fraccion){
        this.numerador= fraccion.denominador;
        this.denominador= fraccion.numerador;
        simplificar();
        dibujarFraccion();
    }

    public void invertirSigno (){
        this.numerador=(-1);
        simplificar();
        dibujarFraccion();
    }
}
 */
     }
