package Boletin_Tema7_Ejercicio5;

public class MainSintonizadorFM {
    public static void main(String[] args) {

        SintonizadorFM radio1=new SintonizadorFM();

        System.out.println("Voy a subir 20 puntos la radio que acabamos de crear");
        for (int i=0;i<20;i++){
            radio1.up();
        }
        System.out.println("La frecuencia actual de la radio es: "+ radio1.getFrecuencia());

        System.out.println("Ahora le voy a bajar 10 puntos");
        for (int i=0; i<10;i++){
            radio1.getFrecuencia();
        }
        System.out.println("L frecuencia actual de la radio es: "+ radio1.getFrecuencia());

    }
}
