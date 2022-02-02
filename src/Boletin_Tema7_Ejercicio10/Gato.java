package Boletin_Tema7_Ejercicio10;
/*
Ejercicio 10.- Implementar una clase Gato con las siguientes características:
 Atributos (String) nombre, color, raza, (Int) edad
 Constructores necesarios
 Que implemente dos método CompareTo para compararlos por nombre y por edad
 Haced un programa principal sencillo que cree dos gatos y pruebe los métodos de
comparación.*/

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

    public String compararNombre(){

        return "";
    }
    public String compararEdad(){

        return "";    }


}
