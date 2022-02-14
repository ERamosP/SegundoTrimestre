package Tema7_Diseño_Tipos;

import Enums.Sexo;

import java.util.Scanner;

public class ClaseMenu {

    static Scanner sc=new Scanner(System.in);
    static int contadorMujer=0;
    static int contadorHombre=0;
    static int contadorOtro=0;
    static int sumaEdad=0;
    static double sumaPeso=0;
    static double sumaAltura=0;

    public static String leerDatosSt(){

        return sc.next();
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
                [4] Sexos
                [0] Salir
                ---------------------------------------""");

    }

    public static void elegirOpcion(){


        boolean salir=false;

        do {
            pintarMenu();

            switch (leerDatosSt()) {
                case "1" -> System.out.println("la "+calcularPesoMedio());
                case "2" -> System.out.println(" "+calcularAlturaMedia());
                case "3" -> System.out.println( " "+calcularEdadMedia());
                case "4" -> {
                    System.out.println("Hay: " + contadorMujer + " mujeres");
                    System.out.println("Hay: " + contadorHombre + " hombres");
                    System.out.println("Hay: " + contadorOtro+ " otro");
                }

                case "0" -> salir = true;
            }


        }while(!salir);

    }

    public static Sexo introducirSexo(){



        Sexo sexo=null;
        do {


        System.out.println("""
              ---------- Con que sexo se identifica ----------
                [1] Hombre
                [2] Mujer
                [3] Otro
                -----------------------------------------------""");

        switch (leerDatosSt()) {
            case "1" -> {
                sexo = Sexo.HOMBRE;
                contadorHombre++;
            }
            case "2" -> {
                sexo = Sexo.MUJER;
                contadorMujer++;
            }

            case "3" -> {
                sexo = Sexo.OTRO;
                contadorOtro++;
            }

            default -> System.out.println("Lo introducido no es valido ");
        }
        }while (sexo==null);
        return sexo;
    }
    public static double calcularPesoMedio(){


        return sumaPeso/Persona.contadorTotal;
    }
    public static double calcularAlturaMedia(){


        return sumaAltura/Persona.contadorTotal;
    }

    public static int calcularEdadMedia(){
        return sumaEdad/Persona.contadorTotal;
    }


}
