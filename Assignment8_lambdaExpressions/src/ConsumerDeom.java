import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
public class ConsumerDeom {

	public static void main(String[] args) {
		Consumer<String> consumer = (t)-> System.out.println(t);
		consumer.accept("Using consumer method in lambda expression");
		
		// Supplier interface
		
		Supplier<String> supplier=()-> "Hello this is  supplier interface";
		System.out.println(supplier.get());
		
		Supplier<LocalDateTime> supplier1=()->LocalDateTime.now();
		System.out.println(supplier1.get());
		
        //Predicate gives true and false
		
		Predicate<String> predicate = (s)-> s.equals("Predicate");
		
		System.out.println(predicate.test("Predicate"));
		
		// Function interface
		
		Function<Integer,Integer> function = (a)->a/2;
		Integer d= function.apply(4);
		System.out.println(d);
		
		
		
	}

}
