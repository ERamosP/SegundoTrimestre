package Boletin_Tema7_Ejercicio1;

import java.util.Scanner;

public class Main_Medios_Transporte {


    //El objetivo de todo esto es ver cómo se puede trabajar sin String usando directamente objetos del
    //tipo enumerado



    public static void main(String[] args) {

        Vehiculo coche1=new Vehiculo();
        Vehiculo coche2=new Vehiculo();


        Scanner sc=new Scanner(System.in);

        //coche1, usando los metodos getter y setter con string
        System.out.println("Introduzca la matricula");
        coche1.setMatricula(sc.nextLine());

     System.out.println("""
                ----   Indique el modelo del vehiculo que desee   ----
                * Mercedes
                * BMW
                * AUDI
                * TOYOTA
                * AVESIS
                * SEAT
                * NISSAN
                -------------------------------------------------------""");
        coche1.setMarcaString(sc.nextLine());

        // coche 2 usando los metodos getters y setters normalmente

        System.out.println("Introduzca la matricula");
        coche2.setMatricula(sc.nextLine());

        System.out.println("""
                ----   Indique el modelo del vehiculo que desee   ----
                * Mercedes
                * BMW
                * AUDI
                * TOYOTA
                * AVESIS
                * SEAT
                * NISSAN
                -------------------------------------------------------""");
        try {
            coche2.setMarca(MarcaDeVehiculo.valueOf(sc.nextLine().toUpperCase()));
        }catch (Exception e){
            System.out.println("Marca de vehiculo no valida");
            coche2.setMarca(MarcaDeVehiculo.MARCA_INCORRECTA);
        }

       System.out.println("la matricula es: " + coche1.getMatricula() +
                " y el modelo " + coche1.getMarcaString());
        System.out.println("la matricula es: " + coche2.getMatricula() +
                " y el modelo " + coche2.getMarca());

}
}
