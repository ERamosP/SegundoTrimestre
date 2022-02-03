package Boletin_Tema7_Ejercicio9;

public class PesoAlturaC implements Cloneable {

    private PersonaC origen;

    private int pesoAltura;

    public PesoAlturaC() {

    }

    public PesoAlturaC(PersonaC origen, int pesoAltura) {
        this.origen = origen;
        this.pesoAltura = pesoAltura;
    }

    public int getPesoAltura() {
        return pesoAltura;
    }

    public void setPesoAltura(int pesoAltura) {
        this.pesoAltura = pesoAltura;
    }

    @Override
    public String toString() {
        return "PesoAlturaC{" +
                "origen=" + origen +
                ", pesoAltura=" + pesoAltura +
                '}';
    }

    public Object clone(){
        PesoAlturaC obj=null;
        try {
            obj=(PesoAlturaC) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("No se ha podido clonar el objeto");
        }

        obj.origen=(PersonaC)obj.origen.clone();
        return obj;


    }



}
