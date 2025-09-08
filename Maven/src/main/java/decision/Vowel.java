package decision;

public class Vowel {
public static void main(String[] args) {
	char c = 'p';
	switch(c) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println("Vowel");
		break;
	default:
		System.out.println("Not a vowel");
	}
}
}
