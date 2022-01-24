package RecopilatorioPag46;

import java.util.Scanner;

public class Coche {

    private  String color;
    private  String marca;
    private  String modelo;
    private  String matricula;
    private int kmRecorridos;

    public Coche(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


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
       queda almacenado el ultimo valor añadido. Por ello no funciona y lo he metido como publico*/

   public static int contarKilomentros(int kmRecorridos){




        int total=getKmRecorridos()+getKmRecorridos();

        return total;
    }


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
