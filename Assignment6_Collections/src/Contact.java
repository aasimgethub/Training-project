
public class Contact {
	private long phoneNo;
	
	private String name;
	private String mail;
	private Enum gender;

	
	public Contact(long phoneNo, String name, String mail, Enum gender) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}
	


	public Contact() {
		super();
	}



	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public Enum getGender() {
		return gender;
	}


	public void setGender(Enum gender) {
		this.gender = gender;
	}
	enum Gender {
		Male,Female;
	}



	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", mail=" + mail + ", gender=" + gender + "]";
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Contact)
		{
			Contact temp=(Contact) obj;
			if(this.phoneNo==temp.phoneNo && this.name.equals(temp.name) && this.mail.equals(temp.mail) && this.gender.equals(temp.gender))
				return true;
			
				
		}
		return false;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ((int)this.phoneNo+this.name.hashCode()+this.mail.hashCode()+this.gender.hashCode());
	}
	
	
}


