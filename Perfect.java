public class Perfect {
	public static void main (String[] args) {
	int nam = Integer.parseInt(args[0]);
	int sam = 0;
        for(int i = 1; i < nam ; i++){
            if (nam % i== 0){
            	sam = i + sam ;

            }

        }
        if (sam == nam) 
        	System.out.println(nam +  " " +"is perfect number");
        else
            System.out.println(nam + " "+" is not a perfect number");
        
     }
}