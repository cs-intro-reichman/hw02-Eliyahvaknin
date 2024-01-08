public class InOrder {
	public static void main (String[] args) {
		// TODO: wrong identations, the code should start here
	int  nam1 = (int)(Math.random()*10); // TODO: num, not nam
	int  nam2 = (int)(Math.random()*10);
	int temp =  nam1;
	System.out.print(nam1);

	while(temp <=  nam2){
		System.out.print(" " +  nam2);
		temp =  nam2;
		nam2 = (int)(Math.random()*10);
		// TODO: don't need this empty line
	}


	}
}
