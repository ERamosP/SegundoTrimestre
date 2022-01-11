package Vehiculo;

public class Modelo {

    public enum MarcaDeVehiculo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI};
        String matricula;
        MarcaDeVehiculo marca;

         Modelo(String matricula, MarcaDeVehiculo marca) {
            this.matricula = matricula;
            this.marca = marca;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarcaString() {
        return marca;
    }

    public void setMarcaString(MarcaDeVehiculo marca) {
        this.marca = marca;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }
}
