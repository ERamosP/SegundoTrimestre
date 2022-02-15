package Tema7_Diseño_Tipos;


import Enums.Sexo;

import java.awt.*;
import java.util.Objects;


public class Persona implements Comparable <Persona>{
    /**
     * Creacion de los atributos de la clase Persona, los que corresponden a la clase como
     * tal estan declarados como privados, hemos creado un atributo estatico, para
     * un contador y la creacion del objeto dentro de la clase para llamar al metodo
     * persona creado mas abajo
     */
            private String nombre;
            private int edad;
            private String dni;
            private Sexo genero;
            private double peso;
            private double altura;
            static int contadorTotal=0;
            static Persona persona=new Persona();
    /**
     * Metodo constructor sin paramentro
     */
    public Persona() {

    }

    /**
     * Metodo constructor con paramentros de entrada
     * @param nombre
     * @param edad
     * @param dni
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, String dni, Sexo genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;

    }

    /**
     * constructor copia
     * @param persona
     */
    public Persona(Persona persona) {
        this.nombre= persona.nombre;
        this.edad = persona.edad;
        this.dni = persona.dni;
        this.genero = persona.genero;
        this.peso = persona.peso;
        this.altura= persona.altura;

    }
// Metodos getters y setters
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

    public Sexo getGenero() {
        return genero;
    }

    public void setGenero(Sexo genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo compareTo para que el orden natural sea a traves del nombre
     * @param p
     * @return
     */
  public int compareTo(Persona p){

        return this.nombre.compareTo(p.nombre);
  }

    /**
     * Metodo para conocer el peso ideal a traves del metodo llamado IMC, creado mas abajo
     *  lo iniciamos a -1, para no tener que darle mas condiciones de las necesarias al if
     *  y lo hacemos de esta manera, ya que enumciado del ejercicio requeria lo siguiente:
     *   Si una persona está por debajo de su peso ideal se devuelve un -1 si está en su
     *   peso ideal un 0 y si tiene sobrepeso un 1.
     * @return
     */
  public static int saberPesoIdeal(){
         int retorno=-1;


        if(calcularIMC()>=25.0){
            retorno=1;
        }else if (calcularIMC()>=18.5 && calcularIMC()<25.0){
            retorno=0;
        }
        return retorno;
  }

    /**
     * Metodo para calcular el indice de grasa corporal
     * @return devuelve el resultado de el peso de la persona/la altura^2
     */
  public static double calcularIMC(){
        return persona.peso/(persona.altura*persona.altura);
  }

    /**
     * Metodo para pintar el peso en pantalla, usando el metodo saberPesoIdeal como
     * referencia para devolver los resultados
     */

  public static void pintarPeso(){

        if (saberPesoIdeal()==0){

        }else if(saberPesoIdeal()==1){
            System.out.println("Estas mu fuerte");
        }else{
            System.out.println("Fino filipino... come, coño!!");
        }
  }

    /**
     * Metodo para saber si el objeto creado es mayor de edad o no
     */
      public static void serMayorEdad(){

            if (persona.edad>=18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("No es mayor de edad");
            }
     }

    /**
     * Metodo equals, para saber si dos objetos se llaman igual introduciendo por parametros
     * el objeto de la clase persona, tan solo lo comentamos ya que no va a devolver nada,
     * pero sirvepara demostrar lo indicado en el apartado posterior
     * @param p
     *
    public boolean equals(Persona p){
        
        if (this.nombre.equals(p.nombre)){
             System.out.println("Se llaman igual");
        }else{
             System.out.println("No se llaman igual");
         }
        return true;
     }*/

    /**
     * Metodo equals con override, ya que viene de la clase generica Objeto
     * en la que demostramos que si queremos crear dos metodos llamado de la misma
     * forma, con los mismos parametros de entrada, pero haciendo el override de la
     * clase Object, se puede hacer. Tiene la misma funcion pero este compara todos los
     * atributos de la clase
     *
     * @param o
     * @return
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && genero == persona.genero
        && Double.compare(persona.peso, peso) == 0
        && Double.compare(persona.altura, altura) == 0
        && Objects.equals(nombre, persona.nombre) && Objects.equals(dni, persona.dni);
    }

    /**
     * metodo para crear un objeto Persona introduciendo los datos por teclado
     * @return
     */
    public static Persona crearPersona(){


        System.out.println("Indique su nombre");
        persona.setNombre(ClaseMenu.leerDatosSt());
        System.out.println("Introduzca la edad");
        persona.setEdad(Integer.parseInt(ClaseMenu.leerDatosSt()));
        System.out.println("Introduzca el DNI");
        persona.setDni(ClaseMenu.leerDatosSt());
        persona.setGenero(ClaseMenu.introducirSexo());
        System.out.println("Introduzca el peso");
        persona.setPeso(Double.parseDouble(ClaseMenu.leerDatosSt()));
        System.out.println("Introduzca la altura");
        persona.setAltura(Double.parseDouble(ClaseMenu.leerDatosSt()));

       return persona;
    }


    /**
     * Metodo toString para imprimir por consola todos los datos de la clase, ademas
     * de introducirle el IMC, que se lo pasamos como metodo y al estar dentro de la
     * misma clase, solo lo invocamos
     * @return
     */

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + System.lineSeparator() +
                ", edad=" + this.edad + System.lineSeparator() +
                ", dni='" + this.dni + System.lineSeparator() +
                ", genero=" + this.genero + System.lineSeparator() +
                ", peso=" + this.peso + System.lineSeparator() +
                ", altura=" + this.altura + System.lineSeparator() +
                ", IMC= " + calcularIMC() + System.lineSeparator();

    }
}
