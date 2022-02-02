package Boletin_Tema7_Ejercicio8;
/*
Ejercicio 8.- Implementar una clase Punto cuyos datos miembros sean las coordenadas de un
punto del plano. Estos datos han de ser privados. Para esta clase se piden los siguientes métodos y
constructores:
 El constructor Punto() recibe como argumento dos números reales, a y b, y construye un
nuevo punto de la clase Punto cuyas coordenadas son a y b.
 Los métodos de acceso getX() y getY(), sin argumentos, que devuelven las coordenadas de
un objeto Punto.
 Los métodos modificadores setX() y setY(), que reciben un argumento y modifican el valor
de la correspondiente coordenada de un objeto Punto.


 */
public class Punto {

    private int coordX;
    private int coordY;

    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Punto(){

    }

    public void setCoordX(int coordX){
        this.coordX=coordX;
    }
    public int getCoordX(){
        return coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordY() {
        return coordY;
    }

    /*
     El método igual(), que comprueba si un objeto de la clase Punto es igual a otro dado que se
pasa como argumento.
 El método distancia(), sin argumentos, que calcula la distancia de un objeto de la clase
Punto al origen de coordenadas.
 El método distancia(), que calcula la distancia de un objeto de la clase Punto a otro que se
proporciona como argumento.
     */

    public void igual(Punto punto){

        if (this.coordX==punto.coordX && this.coordY== punto.coordY){
            System.out.println("El punto uno y el punto dos son iguales");
        }else{
            System.out.println("Los puntos indicados son diferentes");
        }
    }


    public void distancia(){

        return 0;
    }


    public int distancia(Punto punto){

        return 0;
    }
}