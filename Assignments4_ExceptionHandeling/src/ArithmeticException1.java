import java.util.Scanner;

public class ArithmeticException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
        		  try{
        			  
        			  int c= a/b;
        			 System.out.println(c);        			  
        		  }
          catch ( ArithmeticException e){
        	  System.out.println("this number can't be divisible by zero");
        	  
        	  
          }
          
	}

}
