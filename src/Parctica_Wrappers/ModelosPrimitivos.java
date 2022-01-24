package Parctica_Wrappers;

public class ModelosPrimitivos {

    public static void main(String[] args) {

        System.out.println("Obtener la representacion Octal, binaria o hexadecimal de un entero");

        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(System.lineSeparator());



        System.out.println("Obtener el valor entero de una cadena de caracteres");
         System.out.println( Integer.parseInt("12",13) + System.lineSeparator());

        System.out.println("Obtener el maximo de dos enteros");
        System.out.println(Integer.max(9,100)+System.lineSeparator());

       /* System.out.println("Obtener instancias de cualquier tipo");

        System.out.println(Long.valueOf(Long.java:776) + System.lineSeparator());*/

        //es un boolean y
        System.out.println("Saber si un caracter es una letra o un numero, retorna true en caso de que asi sea" +
                "o false en caso de que sea un numero");
        System.out.println(Character.isAlphabetic('d'));
        System.out.println(Character.isDigit(3));//devuelve falso porque no es un digito
        System.out.println(Character.isDigit('3')+System.lineSeparator());//devuelve true porque lo es, ya que esta entre comillas simples


        System.out.println("Realizar operaciones logicas con valores booleanos");
        boolean a=false;
        boolean b=true;
        System.out.println(Boolean.logicalXor(a,b));  // operador or?
        System.out.println(Boolean.logicalAnd(a,b)); // operador and
        System.out.println(Boolean.logicalOr(a,b));  // operador or
    }
}
