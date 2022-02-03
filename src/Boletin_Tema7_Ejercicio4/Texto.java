package Boletin_Tema7_Ejercicio4;

    enum Vocales {a,e,i,o,u,á,é,í,ó,ú,ü}

public class Texto {

            static final String VOCALES = "aeiouáéíóúü";
            private String texto="";
            private int tamañoMaximo=0;

    public Texto(int tamañoMaximo){
        this.texto="";
        this.tamañoMaximo=tamañoMaximo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



    public boolean añadirCaracterInicio(String cadena){

        boolean resultado=false;

        if (this.texto.length()<this.tamañoMaximo){
            this.texto=this.texto+cadena;
            resultado=true;
        }
        return resultado;
    }

    public boolean añadirCaracterFinal(String cadena){

        boolean resultado=false;

        if (this.texto.length()<this.tamañoMaximo){
            this.texto=cadena+this.texto;
            resultado=true;
        }
        return resultado;
    }
    // para saber si existen o no volcales en el texto

    public boolean tieneVocal(char c){

        boolean resultado=false;
        c=Character.toLowerCase(c);
        if (VOCALES.indexOf(c)!=-1){
            resultado=true;
        }
        return resultado;
    }



    // Contar la cantidad de vocales que hay en el texto

    public int contarVocales(){

        int resultado=0;
        for (int i=0;i<this.texto.length();i++){
            if (tieneVocal(texto.charAt(i))){
                resultado++;
            }
        }
        return resultado;
    }



}
