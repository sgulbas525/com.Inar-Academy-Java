public class Checkpoint_08{
        public static void main(String[] args){
		int x = 3 ;
		int y = 2 ;
	  	int z ;	
		
		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		}		
		else
			System.out.println("x is " + x);



		x = 3 ;
                y = 4 ;

                if (x > 2) {
                        if (y > 2) {
                                z = x + y;
                                System.out.println("z is " + z);
                        }
                }
                else
                        System.out.println("x is " + x);



		x = 2 ;
                y = 2 ;

                if (x > 2) {
                        if (y > 2) {
                                z = x + y;
                                System.out.println("z is " + z);
                        }
                }
                else
                        System.out.println("x is " + x);
	}
}
