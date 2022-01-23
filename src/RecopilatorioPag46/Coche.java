package RecopilatorioPag46;

import java.util.Scanner;

public class Coche {

    static String color;
    static String marca;
    static String modelo;
    static String matricula;
    private int kmRecorridos;

    public Coche(){

    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Coche.color = color;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Coche.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public static String getMatricula() {
        return matricula;
    }

    public static void setMatricula(String matricula) {
        Coche.matricula = matricula;
    }
    /**
     * Este metodo lo he hecho publico, ya que al hacerlo statico, no me deja almacenar dos valores diferentes
     * lo que hace es que le asigna a las dos clases el ultimo valor dado. por ello no puedo sumarlo
     * @return
     */
    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public  void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String toString() {
        return "Los kilometros recorridos son " + getKmRecorridos();

    }


 /*     Aqui queria hacer la suma y devolver los dos valores diferentes, pero como he puesto antes
       no me deja hacerlo ya que el metodo estatico al pertenecer solo a la clase, y no al objeto se
       queda almacenado el ultimo valor añadido. Por ello no funciona y lo he metido como publico

   public static int contarKilomentros(int coche1, int coche2){
       int num1= setKmRecorridos(coche1);
        setKmRecorridos(coche2);

        int total=getKmRecorridos()+getKmRecorridos();

        return total;
    }*/

    public static void main(String[] args) {

        Coche coche1=new Coche();
        Coche coche2=new Coche();
        Coche coche3=new Coche();
        Coche coche4=new Coche();

        Scanner sc=new Scanner(System.in);
        int kms1, kms2;
        System.out.println("¿Cuantos kms ha recorrido el primer coche?");
        coche1.setKmRecorridos(sc.nextInt());
        System.out.println("¿Cuantos kms ha recorrido el segundo coche?");
        coche2.setKmRecorridos(sc.nextInt());

       int total= coche1.getKmRecorridos()+ coche2.getKmRecorridos();

        System.out.println("La cantidad de kilometros recorridos entre ambos" +
                " coches es de: " + total);

    }

}
