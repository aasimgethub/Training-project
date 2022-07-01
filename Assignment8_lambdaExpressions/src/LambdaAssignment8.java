import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaAssignment8 extends Thread {
	public void run(){
        System.out.println("Running Thread Name: "+ this.currentThread().getName());
        List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		 Consumer<Integer> consumer= (a)->System.out.println(a);
		for(Integer s:list) {
		consumer.accept(s);
		}
		
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaAssignment8 lm = new LambdaAssignment8();
		lm.start();
		lm.setName("Printing numbers");
	}

}
