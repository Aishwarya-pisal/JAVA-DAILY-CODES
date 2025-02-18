import java.util.*;

class Switch2{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("enter Marks");


		String x=sc.next();


		switch(x){
		
		
			case "O":
				System.out.println("outstanding");
				break;

			case "A":
			        System.out.println("Excellent");
			       break;

		        case "B":
			       System.out.println("poor");
		               break;


		        case "c":
		              System.out.println("less");

	                      break;

	                 default:
	                    System.out.println("invalid input");
     				 break;			    
		
		}


	
	
	
	}

}
