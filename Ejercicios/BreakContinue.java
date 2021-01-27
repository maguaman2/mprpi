public class BreakContinue {
    public static void main(String[] args) {
        //inicializacion
        //condicion
        // incremento
                       //01234
        String nombre = "Mercedes";
        int contador = 0;
        //uso del break;
        for (int i =0; i < nombre.length() ; i++ )
        {
            System.out.println("De letra en letra "+nombre.charAt(i));
            if (nombre.charAt(i) =='e')
            {
                System.out.println("Se encontro la letra buscada ");
                break;
            }

        }
        System.out.println("Aqui es la continuacion");
        /*
        * M  0
        * a  1
        * r
        * c
        * o
        *
        * */

    }
}
