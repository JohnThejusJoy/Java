package array;

public class Add {
public static void main(String[] args) {
	int a[] = {1, 2, 3};
	int b[] = {4, 5, 6};
	int sum[] = new int[a.length];
	System.out.print("Sum array: ");
	for(int i=0;i<a.length;i++) {
		sum[i] = a[i] + b[i];
		System.out.print(sum[i]+" ");
	}
}
}
