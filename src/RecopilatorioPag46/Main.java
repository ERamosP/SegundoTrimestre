package RecopilatorioPag46;

public class Main {
    public static void main(String[] args) {

        Cubo cubo1=new Cubo("laton",true,
                "gris",50,10);
        Cubo cubo2=new Cubo();


    /*  System.out.println("\nAntes de añadirle agua en el cubo este tenia: "+cubo1.getContenidoActual() +
              " y la capacidad maxima es de " + cubo1.getCapacidadMaxima()+" " +
              "por lo que le quedan para que llegue a su maximo "+ (cubo1.getCapacidadMaxima()-cubo1.getContenidoActual()));
        cubo1.llenarCubo(10);*/

        System.out.println();

        cubo1.llenarCubo(10);
        cubo1.vaciarCubo(5);
        cubo2.volcarContenido(cubo1);
        cubo2.dibujarCubo(cubo2);

        System.out.println("Antes de restarle litros al cubo este tenia: "+cubo1.getContenidoActual());

    }
}
