public class DamkaBoard1 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x*2; j++) {
                System.out.print((i+j)%2 == 0 ? "*":" ");
            }
            System.out.println();
        } 
     }
}