package multipleinheritance;

public class Mi implements Show, Details{
public void ShowDetails(String name, int age) {
	System.out.println(name);
	System.out.println(age);
}
}
