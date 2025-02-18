import java.util.*;

class Switch{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);


		int day=sc.nextInt();



		switch(day){
		
		
			case 1:
				System.out.println("Monday");
                                break;
	
			case 2:
                                System.out.println("Thuseday");
                                break;
			
			case 3:
                                System.out.println("Wed");
                                break;

			case 4:
				System.out.println("Thu");
                                break;

			case 5:
                                System.out.println("fri");
                                break;

			case 6:
                                System.out.println("Sat");
                                break;

			case 7:
                                System.out.println("Sunday");
                                break;	


			default:
			       System.out.println("day number must be between 1 to 7");
                                break;
		
		
		}
	
	
	
	
	
	}





}
