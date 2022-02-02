package Boletin_Tema7_ejercicio6;
/**
 * Ejercicio 6.- Se desea obtener la fecha del día y pedir por teclado un número entero de segundos.
 * Se solicita que se muestre la hora del día y las n siguientes horas que se diferencian en un segundo.
 * Habrá que crearse la clase Hora que se seteará con la hora del sistema y que dispondrá de los
 * atributos hora, minutos y segundos
 * Usar Try/catch para validar que los segundos es un valor válido
 */
public class Hora {

    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void sumarYMuestra(int segundos){


        for (int i=0;i<segundos;i++){
            this.segundos=this.segundos+1;
            suma();
            System.out.println("Horas: "+this.horas+ " minutos " +this.minutos+ " segundos "+this.segundos);
        }

     }

     public void suma(){

        if(this.segundos>59){
            this.segundos=0;
            this.minutos++;
        }if (this.minutos>59){
            this.minutos=0;
            this.horas++;
         }if (this.horas>23){
             this.horas=0;

         }
     }


}
