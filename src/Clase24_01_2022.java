import java.util.Date;

public class Clase24_01_2022 {

    public static void main(String[] args) {

           //fecha actual

           Date fecha=new Date();
           System.out.println(fecha);





        Date fecha1=new Date(100,0,1);
        System.out.println(fecha1);

        //fecha
        Date fecha2=new Date(121,11,28,10,06,56);
        System.out.println(fecha2);

        //
        Date fecha3=new Date(-121,11,28,10,06,56);
        System.out.println(fecha3);


        //extraemos cada parte de la fecha 1

        System.out.println("Extraemos la fecha 3");
        System.out.println("Año " + (1900+fecha3.getYear()));
        System.out.println("Mes " +fecha3.getMonth());
        System.out.println("Día " +fecha3.getDate());
        System.out.println("Día " +fecha3.getDay());
        System.out.println("Horas " +fecha3.getHours());
        System.out.println("Minutos " +fecha3.getMinutes());
        System.out.println("Segundos " +fecha3.getSeconds());



        // Uso del after/ before y compare to

           System.out.println("Vamos a comparar fecha 1 y fecha 2 con before after");
           System.out.println("fecha 1 "+fecha1 );
           System.out.println("fecha 2 " +fecha2);
           System.out.println("La fecha 1 es mayor que la fecha 2?" + fecha1.after(fecha2));
           System.out.println("la fecha 1 s mayor que la fecha 2? " + fecha1.before(fecha2));
           switch (fecha1.compareTo(fecha2)){
                  case 1:
                  System.out.println("f2 mayor que f1");
                  break;
                  case -1:
                         System.out.println("fecha 1 es mayot que fecha 2");
                         break;
                  case 0:
                         System.out.println("las fechas son iguales");
                         break;
           }

    }

    }


