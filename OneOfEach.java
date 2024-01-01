public class OneOfEach {
	public static void main (String[] args) {
        boolean boy = false;
        boolean girl = false;
        int Children = 0;

        while (!(boy && girl)) {
            if (Math.random() <= 0.5) {
                System.out.print("b"+" ");
                boy = true;
            } else {
                System.out.print("g ");
                girl = true;
            }
            Children++;
        }
        System.out.println();
        System.out.println("You made it... and you now have " + Children + " children.");
    }
}