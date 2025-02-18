import java.util.*;
class IfElse7{


public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);

		System.out.println("Enter selling price");


		int sp=sc.nextInt();
		int cp=sc.nextInt();


		int x=sp-cp; 
		int y=cp-sp;	



		if( x  > y ){
		
		
		
			System.out.println(" profit of"+x);
		}else if(x<y){
		
			System.out.println("loss of "+y);
		
		}else {
		
			System.out.println("No profit No Loss");
		
		}
	
	
	}

}
