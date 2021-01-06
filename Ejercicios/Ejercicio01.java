import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) { // metodo principal
        // Todas las instrucciones de mi algoritmo
        // Ejemplo de if

        System.out.println("Inicio del programa");
        /*
        boolean conexionWifi;  //declarando la variable
        conexionWifi = true;  // inicializando la variable
        if (conexionWifi){
            //Ejecuta si la condicion es verdadera
            System.out.println("Puede enviar el mensaje en WA");
        }
         */
        int edad;
        //edad =15;
        int count = 10;

        System.out.println("Ingrese su edad");
        Scanner sc = new Scanner(System.in);  //Ingresar desde teclado
        edad = sc.nextInt();

        if (edad >= 18){
            //si la condicion es verdadera
            System.out.println("Ud es mayor de edad");
            count ++;
        }
        else {
            //si la condicion es FALSA
            System.out.println("Ud NO es mayor de edad");
            count --;
        }

        System.out.println("Los mayores de edad son: "+count);
        System.out.println("Fin del programa");


    }
}
