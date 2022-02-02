package Boletin_Tema7_ejercicio6;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main_Hora {
    public static void main(String[] args) {

        int segundos=0;
        GregorianCalendar horaActual=new GregorianCalendar();

        Hora nuevaHora=new Hora(horaActual.get(Calendar.HOUR_OF_DAY),horaActual.get(Calendar.MINUTE),horaActual.get(Calendar.SECOND));

        System.out.println("Horas: "+ nuevaHora.getHoras()+ " minutos " +nuevaHora.getMinutos()+ " segundos "+nuevaHora.getSegundos());

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de segundos a sumar a la hora actual");

        boolean error=false;
        do {
            try {
                segundos = sc.nextInt();
                error=true;
            } catch (Exception e) {
                System.out.println("Introduzca bien los segundos");
                sc.nextInt();
            }
        }while (!error);



        //llamamos al metodo sumarYMostrar

            nuevaHora.sumarYMuestra(segundos);


    }
}
