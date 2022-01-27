package Boletin_Tema7_Ejercicio5;
/*
Ejercicio 5.- Se quiere definir una clase (SintonizadorFM) que permita controlar un sintonizador
digital de emisoras FM; concretamente, se desea dotar al controlador de una interfaz que permita
subir (up) o bajar (down) la frecuencia, en saltos de 0,5 MHz y mostrar la frecuencia en un
momento dado Display. El rango de frecuencias va a oscilar entre 80 y 108 MHz, y al inicio, el
controlador sintonice 80MHz. Si durante una operación de subida o bajada, se sobrepasan los
límites, la frecuencia sintonizada debe pasar al extremo contrario. Escribir un programa principal
básico para probar su funcionamiento.
 */
public class SintonizadorFM {

    private final float FRECUENCIAMAX=108f;
    private final float FRECUENCIAMIN=80f;
    private final float SALTOS=0.5f;
    private float frecuencia;

    public SintonizadorFM() {
    }

    public float getFRECUENCIAMAX() {
        return FRECUENCIAMAX;
    }

    public float getFRECUENCIAMIN() {
        return FRECUENCIAMIN;
    }

    public float getSALTOS() {
        return SALTOS;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * Mostramos que al iniciar el aparato este ha de estar a la frecuencia minimo
     * 80MHz
     */
    public  void iniciarSintonizacion(){

        System.out.println("El aparato esta sintonizado en la frecuencia de 80MHz");
    }
    /**
     * sube la frecuancia en saltos de 0,5 y si llega a su maximo,
     * debe volver a la frecuancia minima
     */
    public void up(float subida){

        float inicio=FRECUENCIAMIN;
        float totalSubida=inicio+(subida*SALTOS);


        if(inicio>FRECUENCIAMAX){

            inicio=FRECUENCIAMIN;
            System.out.println("La frecuencia al subirla es de: "+ totalSubida+ " MHz" );
                this.frecuencia=totalSubida;
        }else{

            System.out.println("La frecuencia al subirla es de: " + totalSubida+ " MHz");
            this.frecuencia=totalSubida;
        }
     }

    /**
     * baja la frecuancia en saltos de 0,5 y si llega a su minimo debe volver a la
     * frecuencia maxima
     * Precondicion: la maquina ha de haber utilizado el metodo up para porder utilizar el
     * metodo down
     */
    public void down(float bajada){

        float inicio=frecuencia;

        float totalBajada =inicio-(bajada*SALTOS);

        if(inicio<FRECUENCIAMIN){

            totalBajada=FRECUENCIAMAX;
            System.out.println( "La frecuencia al bajarla es de: "+totalBajada);

        }else{

            System.out.println("La frecuencia al bajarla es de: " + totalBajada+ " MHz");

        }
    }



    /**
     * mostramos la frecuencua en la que se encuentra el aparato en el momento
     * que elegimos la frecuancia deseada

 ESTO LO HACEMOS DIRECTAMENTE DESDE EL METODO, AL SER UN VOID
     * podemos usa un toString
     */



}
