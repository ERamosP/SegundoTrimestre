package EjercicioCuadrado;

public class Cuadrado {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }


    public String toString() {

         String display="";

        // Pintamos la parte superior del cuadrado

        for (int i=0;i<this.lado;i++){
            display +="*";
        }
        display+="\n";

        for (int i=0;i<this.lado-2;i++){
            display +="*";

            for (int j=0;j<this.lado-2;j++){
                display +=" ";
            }
            display+="*\n";
        }
        for (int i=0;i<this.lado;i++){
            display +="*";
        }

        return display;
    }
}
