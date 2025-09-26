package encapsulation;

public class Enc {
private int accN;
private int accB;
public void bankAcc(int accB, int accN) {
	this.accB=accB;
	this.accN=accN;
}
public int getA() {
	return accN;
}
public int getB() {
	return accB;
}
}
