import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

public class StreamAssignment {
	
	public static int count(String str){
		String[]a= str.split(" ");
		return a.length;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<News> list = Arrays.asList(
					new News(1, "The Budget goals for FY2022-23 aim to further India's aspirations in Amrit Kaal, as it moves towards its 100th year post independence.", "This budget is going to help many people budget budget", "Breaking News"),
					new News(2, "Assam with its vast network of rivers is prone to natural disasters like flood and erosion which has a negative impact on overall development", "The time came where we need to give more focus on east", "Thanks for information"),
					new News(3, "In comming financial year India aiming to become 5 trillion Economy", "Unemployement rate and infation is so high how can we overcome it", "Good work")
					
					);
			List<Fruit> list2=Arrays.asList(
					new Fruit("Mango",60,50,"Yellow"),
					new Fruit("Banana",89,40,"Yellow"),
					new Fruit("Orange",47,70,"Orange"),
					new Fruit("Apple",101,90,"Red"),
					new Fruit("Strawberry",103,100,"Red")
					
					);
			Trader trader1=new Trader("Rakesh","Mumbai");
			Trader trader2=new Trader("Rakesh","Indore");
			Trader trader3=new Trader("Risi","Pune");
			Trader trader4=new Trader("Alok","Pune");
			
			


		List<Transaction> list4=Arrays.asList(new Transaction(trader1,2011,20000),
				new Transaction(trader2,2011,40000),
				new Transaction(trader3,2016,60000) ,
				new Transaction(trader4,2015,80000) 	
					);
			list2.stream().filter(p->p.getCalories()<100)
			.sorted((a,b)->b.getCalories()-a.getCalories())
			.forEach(p->System.out.println(p));
			
			System.out.println("--------------------------------------------------------");
			
			list2.stream().filter(p->p.getColor().equals("Red"))
			.forEach(p->System.out.println(p));;
			
			System.out.println("--------------------------------------------------------");
			
			list2.stream().filter(p->p.getColor().equals("Red"))
			.sorted((m,n)->m.getPrice()-n.getPrice())
			.forEach(p->System.out.println(p));
			
			System.out.println("--------------------------------------------------------");
					
    int n= list.stream().map(p->count(p.getComment())).max(Integer::compare).get();
    list.stream().filter(p->count(p.getComment())==n).forEach(p->System.out.println(p));

         System.out.println("--------------------------------------------------------");
		
   int n1= (int)  list.stream().map(p->p.getCommentByUser()).flatMap(Pattern.compile(" ")::splitAsStream).filter(p->p.contains("budget")).count();
      System.out.println(n1);
      
      System.out.println("--------------------------------------------------------");
      
    int a=list.stream().map(p->count(p.getPostedBYUser())).max(Integer::compare).get();
    list.stream().filter(p->count(p.getPostedBYUser())==a).forEach(p->System.out.println(p));
    
    System.out.println("------------------------10-------------------------------------");
    
    	list4.stream().filter(p->p.getTrader().getCity().equals("Pune"))
    	.map(p->p.getTrader().getName()).sorted()
    	.forEach(p->System.out.println(p));
    System.out.println("------------------------8-------------------------------------");
    	    list4.stream().filter(p->p.getYear()==2011)
    	    .map(p->p.getValue()).sorted()
    	    .forEach(p->System.out.println(p));
    System.out.println("------------------------9-------------------------------------");
    list4.stream().map(p->p.getTrader().getCity()).distinct()
    .forEach(p->System.out.println(p));
    System.out.println("------------------------11-------------------------------------");
    
  List<String> stringList=  (List) list4.stream().map(p->p.getTrader().getName()).sorted().toList();
  stringList.forEach(p->System.out.println(p));
  System.out.println("------------------------12-------------------------------------");
  
  list4.stream().filter(p->p.getTrader().getCity().equals("Indore"))
  .map(b->b.getTrader().getName()).
  forEach(p->System.out.println(p));
  System.out.println("------------------------13-------------------------------------");
  
  list4.stream().filter(p->p.getTrader().getCity().equals("Delhi")).map(p->p.getValue())
  .forEach(p->System.out.println(p));
  
  System.out.println("------------------------14-------------------------------------");
  
 int highest=list4.stream().map(p->p.getValue()).max(Integer::compare).get();
  System.out.println(highest);
  
  System.out.println("------------------------15-------------------------------------");
  
  int minimum=list4.stream().map(p->p.getValue()).min(Integer::compare).get();
  System.out.println(minimum);
  
	}
	
	
}
