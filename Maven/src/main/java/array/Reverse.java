package array;

public class Reverse {
public static void main(String[] args) {
	int n = 12345;
	int [] a = new int[5];
	for(int i=0;i<5;i++) {
		a[i]=n%10;
		n=n/10;
	}
	for(int i=0;i<5;i++) {
		System.out.print(a[i]);
	}
}
}
