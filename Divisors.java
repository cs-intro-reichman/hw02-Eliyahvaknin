public class Divisors {
    public static void main (String[] args) {
        int nam = Integer.parseInt(args[0]); // TODO: num, not nam
        for(int i = 1; i <= nam ; i++){
            if (nam % i== 0){
                System.out.println(i);

            }

        }
    }
}