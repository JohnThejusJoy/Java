package inheritance;

public class Child extends Parent {
	public void details2() {
		System.out.println("He is 27");
	}
	public static void main(String[]args) {
		Child obj = new Child();
		obj.details();
		obj.details2();
	}

}
