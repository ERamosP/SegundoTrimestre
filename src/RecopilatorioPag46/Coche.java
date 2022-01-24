package RecopilatorioPag46;

import java.util.Scanner;

public class Coche {

    private  String color;
    private  String marca;
    private  String modelo;
    private  String matricula;
    private int kmRecorridos;
    private static int cantidad;// para poder llevar un contador de la cantidad de objetos
    //que se va a crear de la clase coches he de ser un contador estatic. explicacion en el cuaderno

    public Coche(){
        cantidad++;// se introduce el contador en el metodo constructor para contabilizarlos
    }
    public static int getCantidad(){//se crea el metodo get para poder sacar por consola la
        //cantidad de clases creadas con la llamada a la clase.getCantidad
        return cantidad;
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


    public static int acumularKms(int kms1, int kms2){
         int totalRecorridos=kms1+kms2;

          return totalRecorridos;
    }



    public static void main(String[] args) {

        Coche coche1=new Coche();
        Coche coche2=new Coche();
        Coche coche3=new Coche();
        Coche coche4=new Coche();
        Coche coche5=new Coche();

        Scanner sc=new Scanner(System.in);
        int kms1, kms2;
        System.out.println("¿Cuantos kms ha recorrido el primer coche?");
        coche1.setKmRecorridos(sc.nextInt());
        System.out.println("¿Cuantos kms ha recorrido el segundo coche?");
        coche2.setKmRecorridos(sc.nextInt());


        System.out.println("El primer vehiculo ha recorrido "+ coche1.getKmRecorridos());

        System.out.println("EL segunfdo coche ha recorrido " +coche2.getKmRecorridos());

        System.out.println("el total de los kms recorridos entre los dos es "+ Coche.acumularKms(coche1.getKmRecorridos(), coche2.getKmRecorridos()));
// aqui sacamos por pantalla la cantidad de objetos creados
        System.out.println("Y la cantidad de coches creados es de " + Coche.getCantidad());
    }

}
