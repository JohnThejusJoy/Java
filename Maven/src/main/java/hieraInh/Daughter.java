package hieraInh;

public class Daughter extends Father{
public void daughtername() {
	System.out.println("The daughter is Girl");
}
public static void main(String[] args) {
	Daughter obj = new Daughter();
	obj.daughtername();
	obj.name();
}
}
