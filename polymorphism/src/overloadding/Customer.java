package overloadding;

class Restaurant{
	void takeOrder(String order) {
		System.out.println("Order given is "+order);
		}
	void takeOrder(String order,String order2) {
		System.out.println("orger given is "+order+"and "+order2);
	}
}

public class Customer {

	public static void main(String[] args) {
		Restaurant ohris=new Restaurant();
		ohris.takeOrder("idly","dosa");
	}
}
