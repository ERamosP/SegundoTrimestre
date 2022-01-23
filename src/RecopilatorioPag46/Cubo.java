package RecopilatorioPag46;

public class Cubo {

    // Atributos


    private String material;
    private boolean asa;
    private String color;
    private int capacidadMaxima;
    private int contenidoActual;

    /**
     * Metodo constructor
     */

    public Cubo() {

        this.material = "plástico";
        this.asa = false;
        this.color = "negro";
        this.capacidadMaxima = 10;
        this.contenidoActual = 0;
    }

    /**
     * Metodo constructor por parametros
     *
     * @param material
     * @param asa
     * @param color
     * @param capacidadMaxima
     * @param contenidoActual
     */

    public Cubo(String material, boolean asa, String color, int capacidadMaxima, int contenidoActual) {

        this.material = material;
        this.asa = asa;
        this.color = color;
        this.capacidadMaxima = capacidadMaxima;
        this.contenidoActual = contenidoActual;
    }

    /**
     * Metodo constructor copia
     *
     * @param copiaCubo
     */

    public Cubo(Cubo copiaCubo) {

        this.material = copiaCubo.material;
        this.asa = copiaCubo.asa;
        this.color = copiaCubo.color;
        this.capacidadMaxima = copiaCubo.capacidadMaxima;
        this.contenidoActual = copiaCubo.contenidoActual;
    }

    /**
     * Metodo getter de material
     *
     * @return material
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * Metodo setter materia, al que se le introduce por paramentro el tipo de material
     *
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Metodo getter de un booleano, que se declara como "isNombre"
     *
     * @return true or false
     */

    public boolean isAsa() {
        return this.asa;
    }

    /**
     * Metodo setter del booleano asa, al que le introducimos por parametros el valor del booleano
     * @param asa
     */
    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    /**
     * Metodo getter para el atributo color
     * @return color
     */

    public String getColor() {
        return this.color;
    }

    /**
     * Metodo setter del atributo color al que se le pasa por parametros el color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo getter del atributo capacidadMaxima
     * @return capacidadMaxima
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Metodo setter de capacidadMaxima al que se le introduce por parametro la capacidad maxima
     * @param capacidadMaxima
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Metodo getter de contenido
     * @return la cantidad contenida en el cubo
     */
    public int getContenidoActual(){
        return this.contenidoActual;
    }

    /**
     * Metodo setter de contenido al que le pasamos por parametros el contenido del cubo
     * @param contenidoActual
     */
    public void setContenidoActual(int contenidoActual){
        this.contenidoActual = contenidoActual;
    }

    //Otros metodos

    /**
     * Metodo que va a devolver la cantidad que le vamos a agregar a un cubo
     * Precondiciones: la cantidad no debe ser mayor que la capacidad maxima del cubo o una cantidad negativa
      * @param litros
     */
    public void llenarCubo(int litros){

        this.contenidoActual +=litros;

        if(this.capacidadMaxima== this.contenidoActual){
            System.out.println("El cubo esta al maximo de su capacidad");

        }else if (this.capacidadMaxima< this.contenidoActual){
            System.out.println("Del cubo sale agua por todos los lados!!!");
            int resto=this.capacidadMaxima-this.contenidoActual;
            System.out.println("Sobrepasa la cantidad maxima del cubo, ya que es de "+ this.capacidadMaxima+
                    " por lo que en el segundo recipiente se quedan almacenados : "+ resto);
        }else{
            int resto=this.capacidadMaxima-this.contenidoActual;
            System.out.println("El cubo alcanzo la capacidad maxima, por lo tanto en el otro cubo quedan almacenados "+
                    resto);


        }

    }

    /**
     * Metodo que indica la cantidad de litros que quedaran en el cubo tras restarle
     * un numero determinado de litros esta no puede ser negativa
     *
     * Precondiciones: el cubo al llegar a cero no puede quedarse en una
     * cantidad negativa, por lo tanto su minimo es 0
     * @param litros
     */
    public void vaciarCubo(int litros){

        contenidoActual -=litros;

        if (contenidoActual <0){
            contenidoActual =0;

        }

    }
/*
    /**
     * Con este metodo queremos controlar la cantidad de litros que se van a verter de un cubo a otro, teniendo en cuenta la
     * capacidad del cubo que va a recibir los litros.
     * Precondiciones: la cantidad de litros de el cubo que va a recibir el liquido del otro, como minimo ha de ser 0
     * y como maximo la capacidad maxima, por lo que si esta esta completa, no puede recibir nada
     * @param cubo
     * @param cantVolcar
     */
   public void volcarContenido(Cubo cubo){


       int totalLlenado= this.contenidoActual+cubo.contenidoActual;

         if (this.capacidadMaxima>this.contenidoActual+cubo.contenidoActual){

             int totalVaciado=this.contenidoActual-this.contenidoActual;

             System.out.println("el cubo 1 tiene "+ totalVaciado + " litros");
             System.out.println("El cubo 2 tiene " + totalLlenado + " litro");
        }else{

            System.out.println("ya no hay mas espacio en el cubo");
             System.out.println("el cubo dos estaría a su maxima capacidad");
        }


    }

    public void dibujarCubo(Cubo cubo){

        if (this.contenidoActual > this.capacidadMaxima){

            for (int altura=0;altura<this.capacidadMaxima;altura++){

                    System.out.println( "|      |");

            }
            System.out.println("|~~~~~~|");
        }
        if (this.contenidoActual < this.capacidadMaxima) {

            for (int altura = 0; altura < this.capacidadMaxima; altura++) {
                if (this.contenidoActual <= altura) {
                    System.out.println("|~~~~~~|");
                } else {
                    System.out.println("|      |");
                }
            }
            System.out.println("--------");
        }
    }
}
