import java.util.*;
class IfElse8{
	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);


			int x =sc.nextInt();
			if(x>100){
			 
				System.out.println(x+"is invalid percetage");
			}else  if(x<=100&& x>=90){
		       
		       		System.out.println("first class with distinction");
		       
		       
		       }else if(x>=75 && x<90){
		       
		       		System.out.println("First class");
		       }else if( x>=50 && x<75){
		       
		      		 System.out.println("second class");
		       }else if(x>=45 && x<50){
		       
		       		System.out.println("pass");
		       }else if(x>=0 && x<45){
		       
		       		System.out.println("Fail");
		       
		       }else if( x<0){
		       
		       		System.out.println("percetage  is not negative");
		       } else {
		       
		       System.out.println("Invalid input");
		       }

	
	
	
	}


}
