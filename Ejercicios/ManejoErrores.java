public class ManejoErrores {
    public static void main(String[] args) {
        double resultado;
        int[] nums = {0,1,0,1};

        try {
            System.out.println(nums[5]);

            }
        catch (Exception e)
        {
            System.out.println("Indice fuera de intervalo... Espera");
        }
        System.out.println("........");


    }
}
