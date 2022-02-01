package Boletin_Tema7_Ejercicio9;
/*
Ejercicio 9.- Implementar una clase PersonaC con las siguientes características:
 Atributos: String Nombre, int edad, String DNI y PesoAlturaC pesoAltura (atributo del tipo
PesoAlturaC);
 Tanto la clase PersonaC como la clase PesoAlturaC tendrán los constructores, setter y getter
necesarios;
 Ambas clases implementarán la interfaz cloneable;
 La clase Persona escribirá dos métodos clone() uno superficial y otro profundo
 Haced un pequeño programa principal para clonar objetos y modificarlos de modo que se
vea que cuando se clona superficialmente, los cambios realizados a los atributos objetos se
reflejan tanto en el objeto original como en el copiado, pero con la copia profunda no
ocurre eso.
 */
public class PersonaC implements Cloneable {

    private String nombre;
    private  String edad;
    private  String dni;

    public PersonaC() {
        this.nombre = " ";
        this.edad = " ";
        this.dni = " ";
    }

    public PersonaC(String nombre, String edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    /**
     * metodo cloneable
     * @return
     */
    public Object clone(){

        PersonaC obj=null;
        try {
            obj=(PersonaC) super.clone();

        }catch (CloneNotSupportedException e){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


}
