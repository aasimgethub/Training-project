import java.util.*;
import java.sql.Date;



public class LinkedList_prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DateOfBirth d1=new DateOfBirth("03-12-2000");
	String s2="2001-12-20";
	Date d= Date.valueOf(s2);
	System.out.println(d);
	
	
	LinkedList d1=new LinkedList();
	d1.add(d);
	System.out.println(d1);
	 //DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-mm-yyyy");
	//String s1=dt.format(null);
    //SimpleDateFormat sm = new SimpleDateFormat("MM-dd-YYYY");
	//String s2=sm.format(d);
	//System.out.println(s2);
	// myDate is the java.util.Date in yyyy-mm-dd format// Converting it into String using formatterString strDate = sm.format(myDate);
	//Converting the String back to java.util.DateDate dt = sm.parse(strDate);

	int year=Integer.parseInt(s2.substring(0,4));
	if((year%4==0)&& (year%100==0) || (year%400==0)) {
		System.out.println("Your Date of birth is "+s2 +" it was a leep year");
		}
	else {
		System.out.println("Your Date of birth is "+s2 +" it was not a leep year");
	}
	
	

	}

}
