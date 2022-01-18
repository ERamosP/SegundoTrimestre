package RecopilatorioPag46;

public class Main {
    public static void main(String[] args) {

        Cubo cubo1=new Cubo("metal",false,
                "gris",2,0);
        Cubo cubo2=new Cubo(cubo1);


    /*  System.out.println("\nAntes de añadirle agua en el cubo este tenia: "+cubo1.getContenidoActual() +
              " y la capacidad maxima es de " + cubo1.getCapacidadMaxima()+" " +
              "por lo que le quedan para que llegue a su maximo "+ (cubo1.getCapacidadMaxima()-cubo1.getContenidoActual()));
        cubo1.llenarCubo(10);*/

        System.out.println();
        cubo1.dibujarCubo(cubo1);
        cubo2.llenarCubo(5);


        System.out.println("Antes de restarle litros al cubo este tenia: "+cubo1.getContenidoActual());

    }
}
