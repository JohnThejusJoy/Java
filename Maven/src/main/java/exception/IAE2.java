	package exception;
	
	public class IAE2 {
		
		public static void validate3(int age4) throws InvalidAgeException{
			if(age4<0) {
				throw new InvalidAgeException("Invalid age");
			}
			else {
				System.out.println("Valid age");
			}
		}
		public static void main(String[] args) {
			int age2 = -1;
			try {
				validate3(age2);
	
			}
			catch(InvalidAgeException ia) {
				ia.printStackTrace();
				System.out.println(ia.getMessage());	
		}
		finally {
			System.out.println("Finally block");
		}
		}
	}
