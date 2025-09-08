package hieraInh;

public class Son extends Father {
public void sonname() {
	System.out.println("The son is Mon");
}
public static void main(String[] args) {
	Son obj2 = new Son();
	obj2.sonname();
	obj2.name();
}
}
