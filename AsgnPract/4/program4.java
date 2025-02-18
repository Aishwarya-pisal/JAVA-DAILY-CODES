import java.util.*;

class IfElse4{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);


		float x=sc.nextFloat();


		if(x>85&& x<=100){
		
			System.out.println("Medical");
		}else if( x<=85 && x<75){
		
			System.out.println("Engineering");
		}else if( x<=75 && x>=65){
		
			System.out.println("Pharmacy or Bsc");
		}else {
		
		
			System.out.println("No Carrier");
		}
	
	}


}
