package RecopilatorioPag46;

public class Cubo {

    // Atributos

    private String material;
    private boolean asa;
    private String color;
    private int capacidadMaxima;
    private int contenido;

    /**
     * Metodo constructor
     */

    public Cubo() {

        this.material = "plástico";
        this.asa = false;
        this.color = "negro";
        this.capacidadMaxima = 10;
        this.contenido = 0;
    }

    /**
     * Metodo constructor por parametros
     *
     * @param material
     * @param asa
     * @param color
     * @param capacidadMaxima
     * @param contenido
     */

    public Cubo(String material, boolean asa, String color, int capacidadMaxima, int contenido) {

        this.material = material;
        this.asa = asa;
        this.color = color;
        this.capacidadMaxima = capacidadMaxima;
        this.contenido = contenido;
    }

    /**
     * Metodo constructor copia
     *
     * @param cubo
     */

    public Cubo(Cubo cubo) {

        this.material = cubo.material;
        this.asa = cubo.asa;
        this.color = cubo.color;
        this.capacidadMaxima = cubo.capacidadMaxima;
        this.contenido = cubo.contenido;
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
    public int getContenido(){
        return this.contenido;
    }

    /**
     * Metodo setter de contenido al que le pasamos por parametros el contenido del cubo
     * @param contenido
     */
    public void setContenido(int contenido){
        this.contenido=contenido;
    }

    //Otros metodos

    /**
     * Metodo que va a devolver la cantidad que le vamos a agregar a un cubo
     * Precondiciones: la cantidad no debe ser mayor que la capacidad maxima del cubo o una cantidad negativa
      * @param litros
     */
    public void llenarCubo(int litros){

        contenido+=litros;

        if(capacidadMaxima==contenido){
            System.out.println("El cubo esta al maximo de su capacidad");

        }else if (capacidadMaxima<contenido){
            System.out.println("Del cubo sale agua por todos los lados!!!");
        }else{
            System.out.println("El cubo puede contener mas capacidad");
        }

    }

    /**
     * Metodo que va a devolver la cantidad de litros que quedan en el cubo
     * tras vaciar una cantidad concreta, la cantidad no puede ser positiva
     * Precondiciones: el cubo al llegar a cero no puede quedarse en una cantidad negativa, por lo tanto su minimo es 0
     * @param litros
     */
    public void vaciarCubo(int litros){

        contenido-=litros;

        if (contenido<0){
            contenido=0;
        }

    }

    /**
     * Con este metodo queremos controlar la cantidad de litros que se van a verter de un cubo a otro, teniendo en cuenta la
     * capacidad del cubo que va a recibir los litros.
     * Precondiciones: la cantidad de litros de el cubo que va a recibir el liquido del otro, como minimo ha de ser 0
     * y como maximo la capacidad maxima, por lo que si esta esta completa, no puede recibir nada
     * @param cubo
     * @param cantVolcar
     */
    public void volcarContenido(Cubo cubo, int cantVolcar){

         if (capacidadMaxima>cubo.contenido){
            cubo.contenido+=cantVolcar;
            this.contenido-=cantVolcar;

             System.out.println("el cubo 1 tiene"+ cubo.contenido);
        }else{

            System.out.println("ya no hay mas espacio en el cubo");
        }


    }

    public void dibujarCubo(){

        if (contenido>capacidadMaxima){

            for (int altura=0;altura<=capacidadMaxima;altura++){
                if (contenido>=altura){
                    System.out.println("~~|~~~~~~|~~");
                }else {
                    System.out.println( "|      |");
                }
            }
            System.out.println("~~|~~~~~~|~~");
        }
        if (contenido<capacidadMaxima) {

            for (int altura = 0; altura <= capacidadMaxima; altura++) {
                if (contenido >= altura) {
                    System.out.println("|~~~~~~|");
                } else {
                    System.out.println("|      |");
                }
            }
            System.out.println("~~~~~~");
        }
    }
}
