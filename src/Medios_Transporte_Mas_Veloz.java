
enum MediosTransporte{  BARCO, CAMION, COCHE, TREN, AVION }

  class Medios_Transporte_Mas_Veloz {

    public static void main(String[] args) {

        /**
         * la idea del ordinal es para saber la posicion que ocupa el transporte en el enum y sacarles el maximo partido
         * o jugar con ellos
         */
        MediosTransporte t1= MediosTransporte.AVION;
        MediosTransporte t2= MediosTransporte.BARCO;
        MediosTransporte t3= MediosTransporte.COCHE;
        MediosTransporte t4= MediosTransporte.TREN;
        MediosTransporte t5= MediosTransporte.CAMION;
        System.out.println("El orden del avion es " + t1.ordinal());

        if (t2.ordinal()< t2.ordinal()){
            System.out.println("el barco es mas lento que el avion");
        }


      //  System.out.println(MediosTransporte.valueOf;
    }
}



