package Tema7_Diseño_Tipos;


public class Persona implements Comparable <Persona>{

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private float peso;
    private float altura;


    public Persona() {
    }

    public Persona(String nombre, int edad, String dni, char genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona persona) {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

  public int compareTo(Persona P){

        return 0;
  }

}
