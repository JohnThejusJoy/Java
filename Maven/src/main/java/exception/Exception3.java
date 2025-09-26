package exception;

public class Exception3 {
public static void main(String[] args) {
	System.out.println("Exception");
	try {
		int x=50/0;

	}
	catch(ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println(ae.getMessage());
	}
	System.out.println("Hi");

	System.out.println("Rest");
}
}
