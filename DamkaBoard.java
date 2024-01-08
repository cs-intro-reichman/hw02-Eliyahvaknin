public class DamkaBoard {
    public static void main(String[] args) {
        // TODO: x, i, j are not informative names. Can be numOfRows, row, col
        int x = Integer.parseInt(args[0]);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x*2; j++) {
                System.out.print((i+j)%2 == 0 ? "*":" ");
            }
            System.out.println();
        } 
     }
}