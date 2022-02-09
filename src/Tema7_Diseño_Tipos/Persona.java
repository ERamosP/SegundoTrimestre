package Tema7_Diseño_Tipos;


public class Persona implements Comparable <Persona>{

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;
    static int contador;

    /**
     * Metodo constructor sin paramentro
     */
    public Persona() {
        contador++;
    }

    /**
     * Metodo constructor con paramentros de entrada
     * @param nombre
     * @param edad
     * @param dni
     * @param genero
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, String dni, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        contador++;
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
        contador++;
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

  public int compareTo(Persona p){

        return this.nombre.compareTo(p.nombre);
  }

  public int saberPesoIdeal(){
         int retorno=-1;


        if(calcularIMC()>=25.0){
            retorno=1;
        }else if (calcularIMC()>=18.5 && calcularIMC()<25.0){
            retorno=0;
        }
        return retorno;
  }

  public double calcularIMC(){
        return this.peso/(this.altura*this.altura);
  }

  public void pintarPeso(){

        if (saberPesoIdeal()==0){

        }else if(saberPesoIdeal()==1){
            System.out.println("Eres un bolindre o estas mu fuerte");
        }else{
            System.out.println("Fino filipino... come coño");
        }
  }

      public void serMayorEdad(int edad){

            if (this.edad>=18){
                System.out.println("Es mayor de edad");
            }else{
                System.out.println("No es mayor de edad");
            }
     }


}
