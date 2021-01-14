public class Ejercicio02 {

    public static void main(String[] args) {
        Math.sqrt(9);        
        int aleatorio = (int) (Math.random() * 5);
        System.out.println(aleatorio);
        String name = "Juan Perez...";
        String correo = "marco@magb.com";
        System.out.println(name.charAt(name.length()-1));
        for(int i =0;i<name.length();i++)
        {
            if(name.charAt(i)=='.')
            System.out.println(name.charAt(i));
        }
        String password = "1233";
        if(password.equals("123")){
            System.out.println("Contraseña correcta");
        }
        else
        {
            System.out.println("Contraseña inccorrecta");
        }
        System.out.println(password.equals("123"));
    }
}
