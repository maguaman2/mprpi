import java.util.Scanner;

public class Repaso01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombreEscuela = sc.nextLine();

        int contador=0;


        for (int i=0; i<nombreEscuela.length();i++) {
            if (nombreEscuela.charAt(i) == '.')
            {

                contador = contador +1; //contador++
            }

        }
        System.out.println("Total de az " +contador);


        /*int numbers;  //float, double para decimales
        numbers = 100;

        numbers = numbers * 10;

        char inicial ;
        inicial = 'M';

        boolean bautizado;
        bautizado = false;

        String nombre;
        nombre = "Hola don pepito";

        String apellido;
        apellido = nombre.substring(7,10);

        System.out.println(apellido);

        System.out.println("El numero almacenado es: "+ numbers+" "+inicial);
        System.out.println(bautizado);
        System.out.println(nombre);*/
        
        }
       }
