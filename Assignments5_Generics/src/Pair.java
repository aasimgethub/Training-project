
public class Pair {
	private String key;
	private String value;
	
	
	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
	public void print() {
		System.out.println(key+" "+value);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pair myObj  =new Pair();
			myObj.setKey("Today is");
			myObj.setValue(String.valueOf(new java.util.Date()));
			myObj.print();
			
	}


	
}
