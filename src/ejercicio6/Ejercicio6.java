
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dd, mm, aa;

        //Ingreso de adtos
        System.out.println("Inserte una fecha :");
        System.out.print("Dia: ");
        dd = sc.nextInt();
        System.out.print("Mes: ");
        mm = sc.nextInt();
        System.out.print("Año: ");
        aa = sc.nextInt();

        //Se crea un objeto Fecha
        Fecha fecha = new Fecha(dd,mm,aa);
        //proceso y salida de datos
        if (fecha.fechaCorrecta()) { //Llamamos al metodo de la fecha correcta

           //Se muestra con el método toString()
            System.out.println("---------------------------------");
            System.out.println("Fecha introducida: " + fecha);

            //Se muestran el dia siguientes 
            System.out.println("El dia siguiente es: ");
            for (int i = 1; i <= 1; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }

        } else { //Si la fecha no es correcta
            System.out.println("---------------------------------");
            System.out.println("La fecha no es valida");
        }
    }    
}
