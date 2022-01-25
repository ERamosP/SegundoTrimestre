package Boletin_Tema7_Ejercicio1;

    enum MarcaDeVehiculo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI,
                             MARCA_INCORRECTA}

public class Vehiculo {

     private String matricula;
     private MarcaDeVehiculo marca;

    public Vehiculo(){

    }

    public void setMatricula(String matricula){
        this.matricula=matricula.toUpperCase();
    }

   public String getMatricula(){
        return matricula;
    }


    public void setMarca( MarcaDeVehiculo marca){
        this.marca=marca;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public MarcaDeVehiculo getMarcaString() {
        return marca;
    }

    public void setMarcaString(String modelo) {

       modelo=modelo.toUpperCase();

       switch (modelo) {

            case "BMW" -> this.marca=MarcaDeVehiculo.BMW;
            case "AVENSIS" -> this.marca=MarcaDeVehiculo.MERCEDES;
            case "TOYOTA" -> this.marca=MarcaDeVehiculo.TOYOTA;
            case "SEAT" -> this.marca=MarcaDeVehiculo.SEAT;
            case "NISSAN" -> this.marca=MarcaDeVehiculo.NISSAN;
            case "AUDI" -> this.marca=MarcaDeVehiculo.AUDI;
            default -> this.marca=MarcaDeVehiculo.MARCA_INCORRECTA;
            }
    }


}
