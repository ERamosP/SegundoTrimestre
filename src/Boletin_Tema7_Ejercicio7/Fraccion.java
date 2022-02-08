package Boletin_Tema7_Ejercicio7;




/**
 * Ejercicio 7.- Crea la clase Fracción. Los atributos, en principio, serán numerador y denominador.
 * El numerador y denominador se introducirán por pantalla. No es necesario usar Try pero sí
 * controlar que el denominador no sea negativo.
 */
public class Fraccion {

        private double numerador;
        private double denominador;

    /**
     * metodo construcctor con valores inicializados a uno para poder ser llamados en los metodos
     */
        public Fraccion(){

        }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    /**
     * creamos un metodo para dibujar por pantalla la fraccion
     */
    public void dibujarFraccion (){
        System.out.println(" " + this.numerador + "/" + this.denominador);
    }
    /**
     * metodo para multiplicar la fraccion por un unico numero
     * @param num
     */
    public void multiplicar (int num){
        this.numerador=num;
        simplificar();
        dibujarFraccion();
    }

    /**
     * metodo para multiplicar dor fracciones, una de ellas dada por paramentro
     * @param fraccion
     */
    public void multiplicarFraccion (Fraccion fraccion){
        this.numerador=fraccion.numerador;
        this.denominador=fraccion.denominador;
        simplificar();
        dibujarFraccion();
    }

    /**
     * creamos un metodo para dividir la fraccion por un numero dado por paramentros
     * @param num
     */
    public void dividir (double num){
        this.denominador/=num;
        simplificar();
        dibujarFraccion();
    }

    /**
     * pretendemos realizar la division de dos fracciones pasandolas por parametros la fraccion que queremos dividir
     * @param fraccion
     */

    public void dividirFraccion (Fraccion fraccion){
        this.numerador= fraccion.denominador;
        this.denominador= fraccion.numerador;
        simplificar();
        dibujarFraccion();
    }

    /**
     * creamos un metodo privado, para qu eno sea accesible para el usuario, ya que lo que queremos conseguir
     * aqui es em mcd
     * @return numer
     */
     private int maximoComunDivisor (){
        int num =(int) Math.abs(this.numerador);
        int den = (int)Math.abs(this.denominador);
        int temp;
        if (den == 0){
            return num;
        }
        while (den != 0){
            temp = num%den;
            num = den;
            den = temp;
        }return num;
    }

    /**
     * creamos un metodo para poder simplificar usando la funcion del mcd las fracciones y llama al metodo dibujar para
     * que las imprima por pantalla
     */
    public void simplificar (){
        int mcd = maximoComunDivisor();
        this.numerador = this.numerador/mcd;
        this.denominador = this.denominador/mcd;
        dibujarFraccion();
    }

    /**
     * Metodo para simplificar invertir el signo de la fraccion
     */
    public void invertirSigno (){
        this.numerador=(-1);
        simplificar();
        dibujarFraccion();
    }
}


