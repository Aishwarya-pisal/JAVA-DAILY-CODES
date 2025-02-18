import java.util.*;

class IfElse1{

	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
	        int Start=sc.nextInt();
		int End = sc.nextInt();


		if(x>=Start && x<=End){
		
		System.out.println(x+" is the range"+ Start+ " to" + End );
		
		}else{
		
		System.out.println(x+" is not the range"+ Start+" to"+ End );
		}
		
	}


}
