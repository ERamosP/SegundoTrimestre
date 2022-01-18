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

        this.material = copiaCubo.getMaterial();
        this.asa = copiaCubo.isAsa();
        this.color = copiaCubo.getColor();
        this.capacidadMaxima = copiaCubo.getCapacidadMaxima();
        this.contenidoActual = copiaCubo.getContenidoActual();
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

    public void llenarCubo(){
        this.capacidadMaxima=this.capacidadMaxima+this.contenidoActual;
    }

    /**
     * Metodo por el que queremos indicar la cantidad de litros que almacena un cubo al agregarle una cantidad de litros
     * indicada por parametros sin saber si el cubo tenia o no contenido en su interior y en el caso de que sobren litros
     * como consecuencia de que este este al maximo de su capacidad, indique cuantos litros sobran
     *
     * Precondiciones: la cantidad no debe ser una cantidad negativa y que el cubo de destino no
     * este a su maximo de capacidad
      * @param litros
     */
    public int llenarCubo(int litros){

        int litrosSobrantes;
        this.contenidoActual = this.contenidoActual + litros;

        if(this.capacidadMaxima<this.contenidoActual){

            litrosSobrantes=this.contenidoActual-this.capacidadMaxima;

        }else {
            this.capacidadMaxima=this.capacidadMaxima+this.contenidoActual;
            litrosSobrantes=0;
        }
        return litrosSobrantes;
    }

    public void vaciarCubo(){
        this.contenidoActual=0;
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
     * Con este metodo queremos controlar la cantidad de litros que se van a verter de un cuboDestino a otro, teniendo en cuenta la
     * capacidad del cuboDestino que va a recibir los litros.
     * Precondiciones: la cantidad de litros de el cuboDestino que va a recibir el liquido del otro, como minimo ha de ser 0
     * y como maximo la capacidad maxima, por lo que si esta esta completa, no puede recibir nada
     * @param cuboDestino
     * @param cantVolcar
     */
   public void volcarContenido(Cubo cuboDestino){

      // cuboDestino.llenarCubo(this.contenidoActual);
       if (cuboDestino.llenarCubo(this.contenidoActual)==0){
           this.vaciarCubo();
       }else if (cuboDestino.llenarCubo(this.contenidoActual)>0){
           this.vaciarCubo();
           this.llenarCubo(this.llenarCubo(cuboDestino.contenidoActual));
       }

    /* int totalLlenado= this.contenidoActual+cuboDestino.contenidoActual;

         if (this.capacidadMaxima>this.contenidoActual+cuboDestino.contenidoActual){

             int totalVaciado=this.contenidoActual-this.contenidoActual;

             System.out.println("el cuboDestino 1 tiene "+ totalVaciado + " litros");
             System.out.println("El cuboDestino 2 tiene " + totalLlenado + " litro");
        }else{

            System.out.println("ya no hay mas espacio en el cuboDestino");
             System.out.println("el cuboDestino dos estaría a su maxima capacidad");
        }*/


    }

    public void dibujarCubo(Cubo cubo){

        if (this.contenidoActual == this.capacidadMaxima){

            for (int altura=0;altura<this.capacidadMaxima;altura++){

                    System.out.println( "|~~~~~~|");

            }
            System.out.println("|~~~~~~|");
        }
        if (this.contenidoActual < this.capacidadMaxima) {

            for (int altura = 0; altura < this.capacidadMaxima; altura++) {
                for (int i=0; i<this.contenidoActual-2;i++) {
                    System.out.print("|");
                }
                    System.out.println("");
                }
            }
            System.out.println(" ");
        }
    }

