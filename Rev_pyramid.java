public class Pyramid {
    public static void main(String[] args) 
    {
        for (int i = 15; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
