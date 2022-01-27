package Boletin_Tema7_Ejercicio5;

/*Ejercicio 5.- Se quiere definir una clase (SintonizadorFM) que permita controlar un sintonizador
digital de emisoras FM; concretamente, se desea dotar al controlador de una interfaz que permita
subir (up) o bajar (down) la frecuencia, en saltos de 0,5 MHz y mostrar la frecuencia en un
momento dado Display. El rango de frecuencias va a oscilar entre 80 y 108 MHz, y al inicio, el
controlador sintonice 80MHz. Si durante una operación de subida o bajada, se sobrepasan los
límites, la frecuencia sintonizada debe pasar al extremo contrario. Escribir un programa principal
básico para probar su funcionamiento.*/

public class SintonizadorFM {


       private final float FRECUENCIAMAX=180;
       private final float FRECUENCIAMIN=80;
       private final float SALTOS=0.5f;

    public float getFRECUENCIAMAX() {
        return FRECUENCIAMAX;
    }

    public float getFRECUENCIAMIN() {
        return FRECUENCIAMIN;
    }

    public float getSALTOS() {
        return SALTOS;
    }

    /**
     * Mostramos que al iniciar el aparato este ha de estar a la frecuencia minimo
     * 80MHz
     */
    public void iniciarSintonizacion(){

        System.out.println("El aparato esta sintonizado en la frecuencia de 80MHz");
    }
    /**
     * sube la frecuancia en saltos de 0,5 hasta llegar a su maximo,
     * pero si lo sobrepasa debe volver a la fecuencia minima
     */
    public void subirFrecuencia(){


    }

    /**
     * baja la frecuancia en saltos de 0,5 hasta llegar a su minimo,
     *      * pero si lo sobrepasa debe volver a la fecuencia maxima
     */
    public void bajarFrecuencia(){


    }

    /**
     * mostramos la frecuencua en la que se encuentra el aparato en el momento
     * que elegimos la frecuancia deseada
     * @return
     */
    public float mostrarFrecuencia(){

        return 0;
    }
}
