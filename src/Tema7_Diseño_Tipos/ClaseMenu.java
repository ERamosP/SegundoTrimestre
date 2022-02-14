package Tema7_Diseño_Tipos;

import Enums.Sexo;

import java.util.Scanner;

public class ClaseMenu {

    static Scanner sc=new Scanner(System.in);

    public static String leerDatosSt(){

        return sc.nextLine();
    }


    /*
    Finalmente, presentará un menú dónde el usuario pueda elegir entre obtener el peso
    medio de todas las personas gestionadas, la altura media, la edad media, o el sexo, cuántos
    fueron hombres y cuántas mujeres.
     */
    public static void pintarMenu() {

        System.out.println("""
                ---------- Menu de opciones -----------
                [1] Conocer peso medio
                [2] Conocer la altura media
                [3] Conocer la edad media
                [4] Cuantas son mujeres
                [5] Cuantos hombres
                [0] Salir
                ---------------------------------------""");

    }

    public static void elegirOpcion(){

        Persona p1=Persona.crearPersona();
        Persona p2=Persona.crearPersona();
        boolean salir=false;

        do {
            pintarMenu();

            switch (leerDatosSt()){

                case "1" :
                    System.out.println(Main_Persona.calcularPesoMedio(p1,p2));

                    break;
                case "2" :
                    System.out.println(Main_Persona.calcularAlturaMedia(p1,p2));
                    break;
                case "3" :
                    System.out.println("");
                    break;
                case "4" :
                    System.out.println("");
                    break;

                case "0":
                    salir=true;
                    break;

            }


        }while(!salir);

    }

    public static Sexo introducirSexo(){

        Sexo sexo=null;
        System.out.println("""
              ---------- Con que sexo se identifica ----------
                [1] Hombre
                [2] Mujer
                [3] Otro
                -----------------------------------------------""");

        switch (leerDatosSt()){
            case "1":
                sexo=Sexo.HOMBRE;
                break;
            case "2":
                sexo=Sexo.MUJER;
            break;
            case "3":
               sexo=Sexo.OTRO;
                break;
            default:
                System.out.println("Lo introducido no es valido ");
        }
        return sexo;
    }
}
