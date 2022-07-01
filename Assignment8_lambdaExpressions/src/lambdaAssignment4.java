import java.util.ArrayList;

public class lambdaAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array= new ArrayList<>();
		array.add("Amit");
		array.add("Venky");
		array.add("Sangam");
		
		array.removeIf( n->(n.length()%2!=0));
		for(String s:array) {
			System.out.println(s);
		}
		

	}

}
