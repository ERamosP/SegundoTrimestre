package Vehiculo;

public class Principal {

    public static void main(String[] args) {

        Modelo modelo1=new Modelo("2587-KJH", Modelo.MarcaDeVehiculo.SEAT);
        System.out.println(modelo1.getMatricula());
        System.out.println(modelo1.getMarcaString());
        System.out.println();
    }
}
