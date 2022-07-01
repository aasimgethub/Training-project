
import java.util.function.*;
public class Student
{
	int age;
public static void main(String[] args) {

Student p1 =new Student();

p1.age=1;

check(p1, p ->p.age < 5);
}

private static void check(Student s, Predicate<Student>preed) 
{
	String result=preed.test(s) ? "match":"not matched"; 
		System.out.print(result); 
}

}