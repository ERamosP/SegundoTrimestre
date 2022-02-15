package Tema7_Diseño_Tipos;

import Enums.Sexo;

import java.util.Scanner;

public class Main_Persona {

    /**
     * Metodo main para poder ejecutar los metodos y las clases creadas en el mismo paquete
     * @param args
     */

    public static void main(String[] args) {

        boolean salir=false;
       do {
           System.out.println(Persona.crearPersona());
           Persona.contadorTotal++;
           Persona.pintarPeso();
           Persona.serMayorEdad();
           System.out.println("""
                   ------- ¿Desea continuar? ------
                   [1] Si
                   [0] No
                   --------------------------------""");
           if (ClaseMenu.sc.nextInt()!=1){
               salir=true;
           }
       }while (!salir);
        ClaseMenu.elegirOpcion();




 }




}
