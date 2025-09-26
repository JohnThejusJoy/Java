package aggregation;

public class Main {
public static void main(String[] args) {
	Author obj = new Author("Authorname", 1000, "Everywhere");
	Author obj2 = new Author("Author2", 50, "Heaven");
	Book obj3 = new Book ("Book1",290,obj);
	Book obj4 = new Book("bOOK2",300,obj2);
	System.out.println("Book: "+obj3.name);
	System.out.println("Book2: "+obj4.auth.AuthorName);
}
}
