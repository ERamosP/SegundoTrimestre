package Boletin_Tema7_Ejercicio10;

public class Main_Gato {
    public static void main(String[] args) {


    Gato gato1=new Gato("Somier", "azul", "comun europea", 3 );
    Gato gato2=new Gato("Somier", "gris", "común europea", 5);


        if(gato1.compareTo(gato2)==0){
            System.out.println("Los gatos tienen la misma edad");
        }else if (gato1.compareTo(gato2)>0){
            System.out.println("El primer gato 1 es mayor que el gato 2");
        }else {
            System.out.println("El gato 2 es mayor que el gato 1");
        }


        if (gato1.compareNombre(gato2)==0){
            System.out.println("Los gatos se llaman " + gato1.getNombre());
        }else{
            System.out.println("El gato 1 se llama "+ gato1.getNombre()+ " y el gato 2 se llama "+
                    gato2.getNombre()+ " por lo que sus nombres no son iguales");
        }

    }
}