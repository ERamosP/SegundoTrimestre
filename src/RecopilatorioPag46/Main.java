package RecopilatorioPag46;

public class Main {
    public static void main(String[] args) {

        Cubo cubo1=new Cubo("laton",false, "rojo",2,0);
        Cubo cubo2=new Cubo(cubo1);

        cubo2.setCapacidadMaxima(5);

        cubo1.llenarCubo();
        System.out.println("cubo 1 "+ cubo1.getContenido());
        cubo1.volcarContenido(cubo2);
        System.out.println("cubo 2 "+cubo2.getContenido());
        cubo2.llenarCubo();
       System.out.println("cubo 2 "+cubo2.getContenido());
        cubo2.volcarContenido(cubo1);
       System.out.println("cubo 1 "+cubo1.getContenido());

    }
}
