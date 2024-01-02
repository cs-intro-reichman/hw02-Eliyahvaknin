public class OneOfEachStats1 {
    public static void main (String[] args) {

        int T = Integer.parseInt(args[0]);
        double totalkids = 0;
        int familiesWith2kids = 0;
        int familiesWith3kids = 0;
        int familiesWith4OrMorekids = 0;
        int[] kidsCounts = new int[T];

        for (int i = 0; i < T; i++) {
           boolean boyborn = false;
        boolean girlborn = false;
        int Children = 0;

             while (!(boyborn && girlborn)) {
            if (Math.random() <= 0.5) {
                    boyborn = true;
                } else {
                    girlborn = true;
                }
                Children++;
            }
            totalkids += Children;
            kidsCounts[i] =Children;

            if (Children == 2) {
                familiesWith2kids++;
            } else if (Children == 3) {
                familiesWith3kids++;
            } else if (Children >= 4) {
                familiesWith4OrMorekids++;
            }
        }
        double averageChildren = totalkids / T;
        int mostCommonNumber = findMostCommonNumber(kidsCounts);

        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2kids);
        System.out.println("Number of families with 3 children: " + familiesWith3kids);
        System.out.println("Number of families with 4 or more children: " + familiesWith4OrMorekids);
        System.out.println("The most common number of children is " + mostCommonNumber + ".");
    }

    private static int findMostCommonNumber(int[] arr) {
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int CommonNumber = 0;
        int max = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                CommonNumber = i;
                max = count[i];
            }
        }

        return CommonNumber;
    }
} }
}