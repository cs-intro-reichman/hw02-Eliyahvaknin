public class Reverse {
	public static void main (String[] args){
        String input = args[0];
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
		      int middle = input.length() / 2;

		       char mid = input.charAt(middle);
		       
		       System.out.println("The middle character " + mid);
    }
}
