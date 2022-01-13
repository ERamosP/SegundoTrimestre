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
     * @param cubito
     */
    public Cubo(Cubo cubito) {

        this.material = cubito.material;
        this.asa = cubito.asa;
        this.color = cubito.color;
        this.capacidadMaxima = cubito.capacidadMaxima;
        this.contenido = cubito.contenido;
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

    public void llenarCubo(int cantidad){

        contenido+=cantidad;

        if(capacidadMaxima==contenido){
            System.out.println("El cubo esta al maximo de su capacidad");

        }else if (capacidadMaxima<contenido){
            System.out.println("Del cubo sale agua por todos los lados!!!");
        }else{
            System.out.println("El cubo puede contener mas capacidad");
        }

    }

    public void vaciarCubo(int cantidad){

        contenido-=cantidad;

        if (contenido<0){
            contenido=0;
        }

    }

    public void volcarContenido(Cubo cubito, int cantVolcar){



        if (capacidadMaxima>cubito.contenido && contenido>=cantVolcar){
            cubito.contenido+=cantVolcar;
            this.contenido-=cantVolcar;

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
