import java.io.*;
class IoException{
	 public static void main(String []a)throws IOException 
	 {

            System.out.println("Start Program");
              

	    int ch= System.in.read();  // error:error: unreported exception IOException; must be caught or declared to be thrown
                                      //         System.in.read();
                                                           // ^
   
            	    

                      
		 System.out.println(ch);   // return ASCII 

	 }

}
