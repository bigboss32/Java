package six;

public class Principal {

	public static void main(String[] args) {
		int a []=new int[1];
		try {
			for (int i = 0; i < 2; i++) {
				System.out.println(a[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("fuera de rango");
		}
		
	}

}
