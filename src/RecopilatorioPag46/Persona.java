package RecopilatorioPag46;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String domicilio;

    public Persona(){

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String toString(){
        return "El nombre el alumno es " + getNombre() + " " + getApellidos()+" tiene " + getEdad() +
                " años de edad y vive en el domicilio " + getDomicilio();
    }

    public static void main(String[] args) {
        Persona persona1=new Persona();
        persona1.setNombre("Jose");
        persona1.setApellidos("Pérez Pérez");
        persona1.setEdad(25);
        persona1.setDomicilio("Calle de la Avestruz nº 25");

        System.out.println(persona1);
    }
}
