package EjercicioCuadrado;

public class Cuadrado {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.lado; i++) {
            stringBuilder.append("* ");
        }
        stringBuilder.append(System.lineSeparator());

         for (int i=0;i<this.lado-2;i++){
            stringBuilder.append("* ");

         for (int j=0;j<this.lado-2;j++){

             stringBuilder.append("  ");
            }
            stringBuilder.append("* ");
         stringBuilder.append (System.lineSeparator());
        }
        for (int i=0;i<this.lado;i++){
            stringBuilder.append("* ");
        }

        return stringBuilder.toString();
    }
}
