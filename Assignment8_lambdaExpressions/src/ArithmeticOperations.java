import java.util.Scanner;
@FunctionalInterface
interface ArithmeticOperator{
	public int oprator(int a, int b) ;
		
	
}

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int m=sc.nextInt();
			int n= sc.nextInt();
		ArithmeticOperator add=(a,b)->a+b;
		System.out.println(add.oprator(m,n));
		
		ArithmeticOperator sub=(a,b)->a-b;
		System.out.println(sub.oprator(m,n));
		
		ArithmeticOperator div=(a,b)->a/b;
		System.out.println(div.oprator(m,n));
		
		ArithmeticOperator multiplication=(a,b)->a*b;
		System.out.println(multiplication.oprator(m,n));
		

		
	}

	

}
