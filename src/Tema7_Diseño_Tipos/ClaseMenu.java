package Tema7_Diseño_Tipos;

import Enums.Sexo;

import java.util.Scanner;

public class ClaseMenu {
    /**
     * Creacion de atributos, todos ellos estaticos para poder ser llamados en los metodos creados
     */
    static Scanner sc=new Scanner(System.in);
    static int contadorMujer=0;
    static int contadorHombre=0;
    static int contadorOtro=0;
    static int sumaEdad=0;
    static double sumaPeso=0;
    static double sumaAltura=0;

    /**
     * Metodo para leer datos por consola y devolver el valor dado mediante un String
     * @return
     */
    public static String leerDatosSt(){

        return sc.next();
    }


    /**
     * Metodo al que se llamara para pintar un menu en consola, en este caso para la clase Persona
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

    /**
     * Metodo para implementar un menu reutilizable en cualquier momento
     */
    public static void elegirOpcion(){


        boolean salir=false;

        do {
            pintarMenu();

            switch (leerDatosSt()) {
                case "1" -> System.out.println("la "+calcularPesoMedio());
                case "2" -> System.out.println(" "+calcularAlturaMedia());
                case "3" -> System.out.println(" "+calcularEdadMedia());
                case "4" -> {
                    System.out.println("Hay: " + contadorMujer + " mujeres");
                    System.out.println("Hay: " + contadorHombre + " hombres");
                    System.out.println("Hay: " + contadorOtro+ " otro");
                }

                case "0" -> salir = true;
            }


        }while(!salir);

    }

    /**
     * Metodo para pedirle al usuario que elija el sexo de la persona que viene a traves de un
     * Enum creado para este metodo, junto con la devolucion de la opcion deseada se incluye un contador,
     * para poder incdicar la cantidad de veces que se ha elegido cada sexo
     * @return
     */
    public static Sexo introducirSexo(){

// inicializamos a null el sexo para poder salir del bucle do while ya que es la salida
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

    /**
     * Metodo para calcular el peso medio de todos los objetos creados
     * @return devuelve el peso medio a traves de dos contadores, uno creado en esta clase,
     * como es sumaPeso y otro declarado en la clase Persona
     */
    public static double calcularPesoMedio(){


        return sumaPeso/Persona.contadorTotal;
    }
    /**
     * Metodo para calcular la altura media de todos los objetos creados
     * @return devuelve el peso medio a traves de dos contadores, uno creado en esta clase,
     * como es sumaAltura y otro declarado en la clase Persona
     */
    public static double calcularAlturaMedia(){


        return sumaAltura/Persona.contadorTotal;
    }
    /**
     * Metodo para calcular la edad media de todos los objetos creados
     * @return devuelve el peso medio a traves de dos contadores, uno creado en esta clase,
     * como es sumaEdad y otro declarado en la clase Persona
     */
    public static int calcularEdadMedia(){
        return sumaEdad/Persona.contadorTotal;
    }


}
