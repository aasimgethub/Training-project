import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface PrintOrder{
	boolean order(Orders t);
}
public class Orders {
	private int orderID;
	private int price;
	private String orderStatus;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Orders(int orderID, int price, String orderStatus) {
		super();
		this.orderID = orderID;
		this.price = price;
		this.orderStatus = orderStatus;
	}
	public Orders() {
		super();
	}
	
	private static void printCond(List <Orders> array ,PrintOrder p) {
		for(Orders o : array) {
			if(p.order(o)) {System.out.println(o);
			}
		}
		
	}
	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", price=" + price + ", orderStatus=" + orderStatus + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders od = new Orders(1,12000,"Accepted");
		Orders od1 = new Orders(2,2000,"Rejected");
		Orders od2 = new Orders(3,5000,"Rejected");
		Orders od3 = new Orders(4,20000,"Accepted");
		
		List <Orders> array = new ArrayList<>();
		array.add(od);
		array.add(od1);
		array.add(od2);
		array.add(od3);
		
	printCond(array,o-> o.getPrice()>=10000 && o.orderStatus.equals("Accepted"));
		
	}
	
}
