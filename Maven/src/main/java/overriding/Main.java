package overriding;

public class Main {
public static void main(String[] args) {
	Doctor doc = new Doctor();
	Surgen sur = new Surgen();
	doc.treaatPatient();
	sur.treatPatient();
}
}
