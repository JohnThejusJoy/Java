package decision;

public class Grade {
public static void main(String[] args) {
	int mark = 99;
	if(mark<40) {
		System.out.println("Fail");
	}
	else if(mark<=60) {
		System.out.println("D");
	}
	else if(mark<=70) {
		System.out.println("C");
	}
	else if(mark<=80) {
		System.out.println("B");
	}
	else if(mark<=100) {
		System.out.println("A");
	}
}
}
