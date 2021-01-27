import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu principal");
            System.out.println("1. Servicios");
            System.out.println("2. Llamadas");
            System.out.println("3. Mensajes");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    //instrcciones
                    System.out.println("Opcion 1");
                break;
                case 2:
                    //instrcciones
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    //instrcciones
                    System.out.println("Opcion 3");
                    break;
                case 0:
                    //instrcciones
                    System.out.println("Chaoo..");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

         ///

        }while(opcion != 0);

    }
}
