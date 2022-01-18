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
     *
     * @param asa
     */
    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    /**
     * Metodo getter para el atributo color
     *
     * @return color
     */

    public String getColor() {
        return this.color;
    }

    /**
     * Metodo setter del atributo color al que se le pasa por parametros el color
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo getter del atributo capacidadMaxima
     *
     * @return capacidadMaxima
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * Metodo setter de capacidadMaxima al que se le introduce por parametro la capacidad maxima
     *
     * @param capacidadMaxima
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Metodo getter de contenido
     *
     * @return la cantidad contenida en el cubo
     */
    public int getContenido() {
        return this.contenido;
    }

    /**
     * Metodo setter de contenido al que le pasamos por parametros el contenido del cubo
     *
     * @param contenido
     */
    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    //Otros metodos

    public void llenarCubo(){
        this.contenido=this.capacidadMaxima;
        System.out.println("El cubo esta a la capacidad maximo que es: " + this.capacidadMaxima);
    }

    public int llenarCubo(int cantidad) {

        int resto;
        contenido += cantidad;

      if (this.capacidadMaxima < this.contenido) {
            resto=this.contenido-this.capacidadMaxima;
        } else {

           resto=0;
        }
        return resto;
    }

    public void vaciarCubo(){
        this.contenido=0;
        System.out.println("El cubo esta vacio");
    }

    public int vaciarCubo(int cantidad) {

        contenido -= cantidad;

        if (contenido < 0) {
            contenido = 0;
        }
            return contenido;
    }

    public void volcarContenido(Cubo cuboDestino) {

        int resto;
        cuboDestino.llenarCubo(this.contenido);

        if (cuboDestino.contenido==cuboDestino.capacidadMaxima){
            System.out.println("El contenido del cubo esta lleno y no ha sobrado nada");
        }else if (cuboDestino.contenido<cuboDestino.capacidadMaxima){
            System.out.println("El cubo tiene: "+ cuboDestino.contenido);
        }else{

            resto=this.contenido-cuboDestino.capacidadMaxima;
            cuboDestino.contenido=cuboDestino.capacidadMaxima;
            //this.llenarCubo(this.llenarCubo(cuboDestino.contenido));
            System.out.println("El cubo de destino esta lleno y en el cubo de origen quedan "+ resto +" litros");
        }


      /*  if (capacidadMaxima > cubito.contenido && contenido >= cantVolcar) {
            cubito.contenido += cantVolcar;
            this.contenido -= cantVolcar;

        } else {

            System.out.println("ya no hay mas espacio en el cubo");
        }*/


    }

    public void dibujarCubo() {


        // Pintamos la parte superior del cuadrado


        for (int i = 0; i < this.capacidadMaxima - 2; i++) {
            System.out.println("*");

            for (int j = 0; j < this.contenido - 2; j++) {
                System.out.print("-------");
            }
            System.out.println("*");


        }
    }
}