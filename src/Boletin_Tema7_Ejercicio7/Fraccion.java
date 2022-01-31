package Boletin_Tema7_Ejercicio7;

/**
 * Ejercicio 7.- Crea la clase Fracción. Los atributos, en principio, serán numerador y denominador.
 * El numerador y denominador se introducirán por pantalla. No es necesario usar Try pero sí
 * controlar que el denominador no sea negativo.
 */
public class Fraccion {

    private float numerador;
    private float denominador;


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
    /*
     Se crearán métodos para simplificar la fracción,
 * multiplicarla y dividirla por un número y por una fracción e invertirle el signo.
 * Para simplificar la fracción ayudaros del método Math.min que devuelve el mínimo de dos
 * números (el tipo devuelto es el mismo tipo de los números que compara)
     */
    public float simplificar(float numerador, float denominador){

       float fraccion=Math.min(this.numerador,this.denominador);
        return fraccion;
    }
}
