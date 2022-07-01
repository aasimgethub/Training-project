import java.util.HashSet;

public class Hashset_prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Contact c1 = new Contact(192345679,"Amit","amit@gmail.com",Contact.Gender.Male); 
      Contact c2 = new Contact(292387679,"Venkat","venky@gmail.com",Contact.Gender.Male); 
      Contact c3 = new Contact(492345679,"Rahul","rahul@gmail.com",Contact.Gender.Male); 
      Contact c4= new  Contact (62334179,"Amit","amit@gmail.com",Contact.Gender.Male); 
      Contact c5 = new Contact(592345679,"Sangam","sangam@gmail.com",Contact.Gender.Male); 
      Contact c6 = new Contact(895345679,"Dheeraj","dheeraj@gmail.com",Contact.Gender.Male); 
      Contact c7 = new Contact(797345679,"Ranjana","ranjana@gmail.com",Contact.Gender.Female); 
      Contact c8 = new Contact(392345679,"sonam","sonam@gmail.com",Contact.Gender.Female); 
      Contact c9 = new Contact(492345679,"Amit","amit@gmail.com",Contact.Gender.Male); 
      Contact c10 = new Contact(10345679,"Duplicate","amit@gmail.com",Contact.Gender.Male); 
      Contact c11 = new Contact(10345679,"Duplicate","amit@gmail.com",Contact.Gender.Male); 
      
      
      HashSet<Contact> hs= new HashSet<>();
      hs.add(c1);
      hs.add(c2);
      hs.add(c3);
      hs.add(c4);
      hs.add(c5);
      hs.add(c6);
      hs.add(c7);
      hs.add(c8);
      hs.add(c9);
      hs.add(c10);
      hs.add(c11);
      
      System.out.println(hs);
      
     System.out.println("------------------------------------------------------------------------------");
      for(Contact c : hs) {
    	  System.out.println(c);
      }
      System.out.println("------------------------------------------------------------------------------");
      
      
      
	}

}
