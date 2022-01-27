package Boletin_Tema7_Ejercicio5;

public class MainSintonizadorFM {
    public static void main(String[] args) {

        SintonizadorFM radio1=new SintonizadorFM();
        SintonizadorFM radio2=new SintonizadorFM();
        radio1.iniciarSintonizacion();
        radio1.up(40);
        radio1.down(29);

    }
}
