package Boletin_Tema7_Ejercicio10;
/*
Ejercicio 10.- Implementar una clase Gato con las siguientes características:
 Atributos (String) nombre, color, raza, (Int) edad
 Constructores necesarios*/
public class Gato {

    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public void  setNombre(String nombre) {
       this.nombre=nombre;
   }
    public void  setColor(String color){
        this.color=color;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }

    /* Que implemente dos método CompareTo para compararlos por nombre y por edad
    Haced un programa principal sencillo que cree dos gatos y pruebe los métodos de
    comparación. */
    public String compararNombre(Gato gato){

       if (this.nombre.equals(gato.nombre)){
           return "Los dos gatos se llaman igual";
       }else


        return "Tienen distinto nombre";
    }
    public int compararEdad(Gato gato) {


        if (this.edad == gato.edad) {
           int edad = this.edad;
       }
        return edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }
}
