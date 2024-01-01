
public class OneOfEachStats1 {
	public static void main (String[] args) {

        int T = Integer.parseInt(args[0]);

        int totalkids = 0;
        int[] familySize = new int[5]; 
        int maxSizeCount = 0;
        int mostCommonFamilySize = 0;

        for (int i = 0; i < T; i++) {
            int numberOfChildren = simulateOneFamily();
            totalkids += numberOfChildren;

            if (numberOfChildren >= 4) {
                familySize[4]++;
            } else {
                familySize[numberOfChildren]++;
            }


            if (familySize[numberOfChildren] > maxSizeCount) {
                maxSizeCount = familySize[numberOfChildren];
                mostCommonFamilySize = numberOfChildren;
            }
        }


        double averageChildren = (double) totalkids / T;
        System.out.printf("Average: %.9f children to get at least one of each gender.%n", averageChildren);
        System.out.println("Number of families with 2 children: " + familySize[2]);
        System.out.println("Number of families with 3 children: " + familySize[3]);
        System.out.println("Number of families with 4 or more children: " + familySize[4]);
        System.out.println("The most common number of children is " + (mostCommonFamilySize >= 4 ? "4 or more" : mostCommonFamilySize) + ".");
    }

    private static int simulateOneFamily() {
        boolean boyBorn = false;
        boolean girlBorn = false;
        int numberkids = 0;

        while (!(boyBorn && girlBorn)) {
            if (Math.random() < 0.5) {
                boyBorn = true;
            } else {
                girlBorn = true;
            }

            numberkids++;
        }

        return numberkids;
    }
}