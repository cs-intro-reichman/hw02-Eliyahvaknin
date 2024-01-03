import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int times = Integer.parseInt(args[1]);
        Random generator = new Random(times);  
        double rnd;

        double totalChildren = 0;
        int familiesWith2Children = 0;
        int familiesWith3Children = 0;
        int familiesWith4OrMoreChildren = 0;
        String mostCommonNumber="";

        for (int i = 0; i < T; i++) {
            boolean boyBorn = false;
            boolean girlBorn = false;
            int Children = 0;
            while (!(boyBorn && girlBorn)) {
                rnd = generator.nextDouble();
                if (rnd > 0.5) {
                    boyBorn = true;
                } else {
                    girlBorn = true;
                }
                Children++;
            }
            totalChildren += Children;
            if (Children == 2) {
                familiesWith2Children++;
            } else if (Children == 3) {
                familiesWith3Children++;
            } else if (Children >= 4) {
                familiesWith4OrMoreChildren++;
            }

            if(familiesWith2Children > familiesWith3Children){
                mostCommonNumber = "2";
            } else if (familiesWith3Children > familiesWith4OrMoreChildren){
                mostCommonNumber = "3";
            } else{
                mostCommonNumber = "4 or more";
            }
        }
        double averageChildren = totalChildren / T;

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2Children);
        System.out.println("Number of families with 3 children: " + familiesWith3Children);
        System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);
        System.out.println("The most common number of children is " + mostCommonNumber + ".");

		    
	}
}

