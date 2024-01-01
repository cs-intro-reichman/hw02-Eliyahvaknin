
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
        boolean boy = true;
        boolean girl = true;
        int Children = 0;

        while ((boy && girl)) {
            if (Math.random() < 0.5) {
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