public class OneOfEach {
	public static void main (String[] args) {
        boolean boyborn = false; // TODO: boyBorn
        boolean girlborn = false; // TODO: girlBorn
        int Children = 0; // the convention is to start the variable names in lower case

        while (!(boyborn && girlborn)) {
            if (Math.random() <= 0.5) {
                System.out.print("b"+" ");
                boyborn = true;
            } else {
                System.out.print("g ");
                girlborn = true;
            }
            Children++;
        }
        System.out.println();
        System.out.println("You made it... and you now have " + Children + " children.");
    }
}