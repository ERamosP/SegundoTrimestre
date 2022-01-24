package Clase_Enum_pag76_Tema7;

import javax.swing.*;
import java.util.Scanner;

enum tipoMaderas{ ROBLE, CAOBA, NOAK, CEREZO, PINO}

public class Maderas {

    private tipoMaderas tablones;

    public void setTablones(tipoMaderas tablones) {
        this.tablones = tablones;
    }

    public tipoMaderas getTablones() {
        return tablones;
    }
    public static boolean elegirMadedera(tipoMaderas tablones){



        if (tablones==tipoMaderas.ROBLE){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
     Maderas tabla1=new Maderas();
        System.out.println("Introduzca el material que desee");

    System.out.println( elegirMadedera(tipoMaderas.valueOf(sc.next())));
    }
}
