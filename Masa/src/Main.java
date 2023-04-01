import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int peso=0;
		double altura=0,resultado;
		System.out.println("escribe tu peso en KG");
		peso=leer.nextInt();
		System.out.println("escribe tu altura");
		altura=leer.nextDouble();
		resultado=peso/(altura*altura);
		System.out.println("resultadp= "+resultado);
		
		if (resultado<18.5){
			System.out.println("bajo de peso");
		}else{
			if (resultado<24.9) {
				System.out.println("normal de peso");
			}else {
				if (resultado<26.9) {
					System.out.println("sobre peso grado I");
				}else {
					if (resultado<29.9) {
						System.out.println("sobre peso grado II");
					}else {
						if (resultado<34.9) {
							System.out.println("obsesidad tipo I");
						}else {
							if (resultado<39.9) {
								System.out.println("obsesidad tipo II");
							}else {
								if (resultado<49.9) {
									System.out.println("obsesidad tipo III morbida");
								}else{
									System.out.println("obsesidad tipo Iv extrema");
								}
							}
						}
					}
				}
			}
		}
		
	}

}
