public class Perfect {
    public static void main (String[] args) {
    int nam = Integer.parseInt(args[0]);
    int sam = 0; // TODO: sum, not sam
        for(int i = 1; i < nam ; i++){
            if (nam % i== 0){
                sam = i + sam ;
                // TODO: redundant empty lines

            }

        }
        if (sam == nam) {
            System.out.print(nam +  " " +"is a perfect number since " + nam +" = 1"  ); // TODO: put space after + symbol
                    for(int i = 2; i <= (nam/2) ; i++){
                        if (nam % i== 0){
                            System.out.print(" + " + i );
            
                        }
                            // TODO: redundant empty lines

                    }
                }
                else
            System.out.println(nam + " is not a perfect number");
            } // TODO: wrong place of "}"
            
        } // TODO: wrong place of "}"