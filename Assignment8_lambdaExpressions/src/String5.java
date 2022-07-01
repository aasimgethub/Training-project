import java.util.function.Consumer;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= "This is a String";
			 String s1[] = s.split(" +");
			 StringBuilder s2 = new StringBuilder() ;
			 for(String sb: s1) {
				 Consumer<String> consumer = (b)->s2.append(b.charAt(0)) ;
				 consumer.accept(sb);
			
			 }
			 System.out.println(s2);
			
	}

}
