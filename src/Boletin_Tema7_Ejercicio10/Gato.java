package Boletin_Tema7_Ejercicio10;

/*
Ejercicio 10.- Implementar una clase Gato con las siguientes características:
 Atributos (String) nombre, color, raza, (Int) edad
 Constructores necesarios*/
public class Gato implements Comparable<Gato> {

    private String nombre;
    private String color;
    private String raza;
    private int edad;

    public Gato() {

    }

    public Gato(String nombre, String color, String raza, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    /* Que implemente dos método CompareTo para compararlos por nombre y por edad
    Haced un programa principal sencillo que cree dos gatos y pruebe los métodos de
    comparación. */

    /**
     * Con este metodo lo que se pretende es comprarar la edad de los gatos para saber si
     * tienen o no la misma edad, por lo que inicializamos el vamos de devolucion a -1, que
     * es uno de los 3 valores que retorna el compareTo, por ello si devuelve un 1 el primero es mayor que el segundo,
     * un 0 si son iguales y -1 si el segundo es mayor que el primero
     * @param gato
     * @return devuelve un numero entre el -1 y 1.
     */

    public int compareTo(Gato gato) {

        int devolucion = -1;

        if (this.edad == gato.edad) {
            devolucion = 0;
        } else if (this.edad > gato.edad) {
            devolucion = 1;
        }
        return devolucion;
    }

    /**
     * pasamos los dos valores de String a entero con la sentencia primera, una vez que
     * hemos hecho esto creamos un if para comparar los valores obtenidos en el int.
     * si es 0, son iguales y si no lo es es distonto
     *
     * @param gato
     * @return un entero 0 si es true, y 1 si es false
     */
    public int compareNombre(Gato gato) {

        int nombre = this.nombre.compareTo(gato.nombre);
        int devolucion;
        if (nombre == 0) {
            devolucion = 0;
        } else {
            devolucion = 1;
        }
        return devolucion;
    }

}
