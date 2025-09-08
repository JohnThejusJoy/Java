package multiInh;

public class Son extends Father{
public void age() {
	System.out.println("He is 16");
}
public static void main(String[] args) {
	Son obj = new Son();
	obj.details();
	obj.data();
	obj.age();
}
}
