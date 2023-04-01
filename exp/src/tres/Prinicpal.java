package tres;

public class Prinicpal {

	public static void main(String[] args) {
		String a ="hola";
		try {
			int b=Integer.parseInt(a);
		} catch (NumberFormatException e) {
			System.out.println("no cumple el formato");
		}
	}

}
