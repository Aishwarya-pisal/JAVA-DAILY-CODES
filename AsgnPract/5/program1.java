import java.util.*;

class Switch1{

	public static void main(String[]args){
		
		
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter Color");

		String x=sc.next();

		switch(x){
		
		
			case "Red":
				System.out.println("Stop");
				break;

			case "Green":
			      System.out.println("Go");
			        break;
		      	
			case "Yellow":	      
		 		System.out.println("Look & Go");
				break;

			default:
				System.out.println("No Such Color Present in traffic lights");
			break;	
		
		}
		
	}
}
