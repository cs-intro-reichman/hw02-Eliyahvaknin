public class OneOfEachStats1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer as a command-line argument.");
            return;
        }

        int T = Integer.parseInt(args[0]);

        double totalChildren = 0;
        int familiesWith2Children = 0;
        int familiesWith3Children = 0;
        int familiesWith4OrMoreChildren = 0;
        int mostCommonNumber = 0;
        int maxCount = 0;

        for (int i = 0; i < T; i++) {
            boolean boyBorn = false;
            boolean girlBorn = false;
            int Children = 0;

            while (!(boyBorn && girlBorn)) {
                if (Math.random() < 0.5) {
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

            if (Children > maxCount) {
                mostCommonNumber = Children;
                maxCount = Children;
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
