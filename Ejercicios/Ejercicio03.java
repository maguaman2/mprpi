import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] edades;
        edades = new int[4]; //instanciar
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<edades.length;i++ )
        {
           edades[i] = sc.nextInt();
        }

        String[] nombres = new String[4];
        nombres[0]="Juan";
        nombres[1]="Jose";
        nombres[2]="Pedro";
        nombres[3]="Lucas";
        //vectores paralelos

        //System.out.println("Su nombre es: "+nombres[0]+" y su edad es: "+edades[0]);

        //comprobar si este nombre tiene la vocal a?
/*        String nombre = "Juxn Perez";
        for(int i=0; i<10; i++)
        {
            if (nombre.charAt(i) == 'a') {
                System.out.println("Si contiene la letra");
            }

        }
        */




    }
}
