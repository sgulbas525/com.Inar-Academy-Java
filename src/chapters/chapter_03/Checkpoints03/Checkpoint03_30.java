package Checkpoints03;

public class Checkpoint03_30 {
        public static void main(String[] args) {
		int x = 3;
		int y = 3;
		
		switch(x + 3){
			case 6 : y = 1;
			default : y+= 1;
		}
		 System.out.println("After switch statement y is " + y);

		 y = 3;

		 if(x + 3 == 6)
			 y = 1 ;
		 
		 y += 1;

		 System.out.println("After if statement y is " + y);

		}
}
