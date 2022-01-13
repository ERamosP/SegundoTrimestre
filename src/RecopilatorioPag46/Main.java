package RecopilatorioPag46;

public class Main {
    public static void main(String[] args) {

        Cubo cubo1=new Cubo("laton",true, "gris",20,10);
        Cubo cubo2=new Cubo();


      /*  System.out.println("\nAntes de añadirle agua en el cubo hay: "+cubo1.getContenido());
        cubo1.llenarCubo(10);
        System.out.println("Despues de añadirle agua el cubo tiene: " +cubo1.getContenido());
        System.out.println();*/

      /*  System.out.println(cubo1.getContenido());
        cubo1.vaciarCubo(11);
        System.out.println(cubo1.getContenido());*/

       cubo1.volcarContenido(cubo2, 5);
       cubo1.dibujarCubo();


    }
}
