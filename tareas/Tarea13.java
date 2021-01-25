public class Tarea13 {
    public static void main(String[] args) {

        String email;
        email = "magbmail@gmail.com";
        char letra;
        int arrobas=0;
        int puntos = 0;

        //for tiene 3 componentes: inicializacion, condicion e incremento
        //1. contar los arrobas
        for (int i =0;i<email.length();i++)
        {
            letra = email.charAt(i);
            if (letra=='@')
            {
                arrobas = arrobas+1;
            }
        }
        if (arrobas>1)
            System.out.println("Error tiene mas de un @");

        //1. contar los puntos
        for (int i =0;i<email.length();i++)
        {
            letra = email.charAt(i);
            if (letra=='.')
            {
                puntos = puntos+1;
            }
        }
        if (puntos==0)
            System.out.println("Error, no tiene puntos");

        if ((email.charAt(0) =='@') || (email.charAt(email.length()-1) =='@'))
            System.out.println("Error, no debe iniciar ni terminar con un @");

    }

}
