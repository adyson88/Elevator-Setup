

		import java.util.*;


		public class Elevator{
		    public static void main(String[] args){


		        int m, n;
		        int k;
		        int c = 0;
		        Scanner sc = new Scanner(System.in);
		        while(true){

		           System.out.println("1.Operate the Elevator");
		           System.out.println("2.Quit");
		           if (c == 0)
		              System.out.println("The Elevator is at basement");
		           else {
		              System.out.println("The Elevator is at floor " + c );
		           }
		           System.out.print("Enter choice:");
		           k = Integer.parseInt(sc.nextLine());
		      
		           if (k == 2){
		              break;
		           }
		           if (k == 1){
		              System.out.print("Enter your floor (0,1,2):");  // 0- Basement
		              n = Integer.parseInt(sc.nextLine());
		              int valid = 0;
		              System.out.print("Enter which floor you want to go:");
		              m = Integer.parseInt(sc.nextLine());
		              if (c == 0)
		                 System.out.println("The Elevator is at basement");
		              else {
		                 System.out.println("The Elevator is at floor " + c );
		              }
		              if (c == n){
		                 System.out.println("The Elevator(E) is now open 'O'");
		                 if (m > c){
		                    System.out.println("The Elevator(E) is U");
		                    System.out.println("The Elevator(E) is now at " + m );
		                    c = m;
		                 } 
		                 if (m < c){
		                    System.out.println("The Elevator(E) is D");
		                    System.out.println("The Elevator(E) is now at " + m );
		                    c = m;
		                 } 
		              }
		              else {
		                 if (n > c){
		                    System.out.println("The Elevator(E) is U");
		                    System.out.println("The Elevator(E) is now at " + n);
		                    System.out.println("The Elevator(E) is now open 'O'");
		                    System.out.println("The Elevator(E) is now close 'C'");
		                    c = n;
		                    if (m > c){
		                       System.out.println("The Elevator(E) is U");
		                       System.out.println("The Elevator(E) is now at " + m );
		                       System.out.println("The Elevator(E) is open 'O' ");
		                       c = m;
		                    } 
		                    if (m < c){
		                       System.out.println("The Elevator(E) is D");
		                       System.out.println("The Elevator(E) is now at " + m );
		                       System.out.println("The Elevator(E) is open 'O' ");
		                       c = m;
		                    } 
		                 }               
		              }             
		           }
		        }
		    }
		

		
		
	}


