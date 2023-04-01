package exp;

public class Principal {

	public static void main(String[] args) {
		try {
			System.out.println(3/1);
			System.out.println("hice la divsion");
			
		} catch (ArithmeticException e) {
			System.out.println("hola");
			
		}finally {
			System.out.println("hola2");

		}
		

	}

}
