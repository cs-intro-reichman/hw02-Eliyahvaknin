public class Perfect1 {
    public static void main (String[] args) {
    int nam = Integer.parseInt(args[0]);
    int sam = 0;
        for(int i = 1; i < nam ; i++){
            if (nam % i== 0){
                sam = i + sam ;


            }

        }
        if (sam == nam) {
            System.out.print(nam +  " " +"is a perfect number since " + nam +" = 1"  );
                    for(int i = 2; i <= (nam/2) ; i++){
                        if (nam % i== 0){
                            System.out.print(" + " + i );
            
                        }
            
                    }
                }
                else
            System.out.println(nam + " is not a perfect number");
            }
            
        }