import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface info{
	int AuthorID();
	String AuthorName();
	String Supervisor();
	String Date();
	String Time();
	int Version();
	String Description();
}

public class Book {
	@info(AuthorID = 1, AuthorName = "Amit", Date = "21-06-2022", Description = "", Supervisor = "", Time = "6:00 Pm", Version = 5)
	public static void useBook() {
		System.out.println("Method running");
	}
	 
  
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
          Book book = new Book();
          Method m = book.getClass().getMethod("useBook");
          Annotation a= m.getAnnotation(info.class);
          info i= (info) a;
          useBook();
          System.out.println("Author Name :"+i.AuthorName());
       
	}

	
}
