package overridding;

class Car{
	void cost() {
		System.out.println("no cost");
	}
	void milage() {
		System.out.println("no milage");
	}
}
class Audi extends Car{
	void cost() {
		System.out.println("Audi cost is 40lakhs");
	}
	void milage() {
		System.out.println("Audi milage is 15km");
	}
}
class Bmw extends Car{
	void cost() {
		System.out.println("Bmw cost is 50 lakhs");
	}
	void mialge() {
		System.out.println("Bmw milage is 10km");
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		Car c;
		c=new Audi();
		c.cost();
		c.milage();
		c=new Bmw();
		c.cost();
		c.milage();
	}
}
