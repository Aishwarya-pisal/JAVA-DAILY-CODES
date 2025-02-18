import java.util.*;
class Pythagorean{
	public static void main(String[]args){
 		Scanner sc =new Scanner(System.in);

			 int a =sc.nextInt();
			 int b=sc.nextInt();
			 int c=sc.nextInt();
                            
			 int x=a*a + b*b;

			 System.out.println(x);
			 int y=c*c;


			 if(x==y){
				 System.out.println("It is a Pythagorean triplet");



			 }else{
			 
			 System.out.println("It is not a Pythagorean triplet");

			 }
 
 
          }


}
