package supe3;

public class Child extends Parent{
public void display() {
	System.out.println("Same");
}
public void work() {
	super.display();
	System.out.println("Child");
}
}
