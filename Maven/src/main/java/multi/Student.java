package multi;

public class Student extends Course {
	String sname = "Kuttan";
	public void iD() {
		System.out.println(cname+coursen+sname);
	}

public static void main(String[]args) {
	Student s = new Student();
	s.iD();
}
}