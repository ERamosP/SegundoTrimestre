package Boletin_Tema7_Ejercicio9;

public class Main_Persona_Altura {

    public static void main(String[] args) {
        PersonaC persona1=new PersonaC("Eva","42","54875145C");

        //clon de la clase PersonaC
        PersonaC pCopia=(PersonaC)persona1.clone();
        System.out.println("Persona clonada en profundidad:");
        System.out.println(pCopia.toString());

        //clon superfical de la clase PersonaC
        PersonaC pCopiaSuperficial=(PersonaC) persona1.cloneSuperficial();
        System.out.println("Persona clonada superficialmente" + pCopiaSuperficial.toString());

        PesoAlturaC pesoAlturaC=new PesoAlturaC(persona1,60);
        //clon copia
        PesoAlturaC pCopiaPeso=(PesoAlturaC) pesoAlturaC.clone();
        System.out.println("Peso altura original"+ pesoAlturaC.toString());
        System.out.println("Peso altura clonado" + pCopiaPeso.toString());
    }
}
