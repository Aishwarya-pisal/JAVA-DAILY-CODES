import java.util.*;

class IfElse6{

        public static void main(String[]args){

                Scanner sc =new Scanner(System.in);

                int num=sc.nextInt();

                if(num%3==0|| num%7==0){

                System.out.println(num+"Divisible by 3");
                }else if (num%7==0|| num%3==0){

                System.out.println(num+" divisible by 7");
                }else{
		
		
		System.out.println(num+"is neither divisible by 3 nor 7");
		}



        }

} 
