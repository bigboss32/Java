import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double total,totalfinal;
		System.out.println("Menu");
		System.out.println("1)Ingresos superiores");
		System.out.println("2)bienes o patrimonio");
		System.out.println("3)consumo de tarjetas de credito");
		System.out.println("4)consignacion bancarias");
		System.out.println("ingrese su opcion");
		Scanner leer = new Scanner(System.in);
		int opcion=leer.nextInt();
		System.out.println("Tipo de persona");
		System.out.println("1)Funcionario publico");
		System.out.println("2)Persona indpendiente");
		int persona=leer.nextInt();
		System.out.println("Ingre valor");
		int valor=leer.nextInt();
		System.out.println("dia");
		String dia=leer.next();
		System.out.println("Mes");
		String mes=leer.next();
		System.out.println("año");
		String an=leer.next();
		System.out.println("Cedula");
		String cedula=leer.next();
		if (cedula.length()>=8) {
			System.out.println("supera la cantidad 8");
			System.out.println("vuelva a intentar");
			cedula=leer.next();
		}



		switch (opcion) {
		case 1: {
			if (valor>= 49849800 & valor<=72892000) {
				total=(valor*1.2)/100;
				System.out.println("valor a pagar " + total);
				if (persona==1) {
					totalfinal=(total*5)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));
				}else {
					totalfinal=(total*3)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));

				}
				int a =cedula.length()-2;
				cedula.substring(a, cedula.length());
				double b=total-totalfinal;
				if (cedula.substring(a, cedula.length()).equals(dia)){
					System.out.println("Felicidades dia concuerda con cedula");
					System.out.println("Total definitivo " + (b-(b*10)/100));

				}


			}else {
				System.out.println("no paga impuestos");
			}

			break;

		}
		case 2:{
			if (valor>=160234500) {
				total=(valor*1)/100;
				System.out.println("valor a pagar " + total);
				if (persona==1) {
					totalfinal=(total*5)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));
				}else {
					totalfinal=(total*3)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));

				}
				int a =cedula.length()-2;
				cedula.substring(a, cedula.length());
				double b=total-totalfinal;
				if (cedula.substring(a, cedula.length()).equals(dia)){
					System.out.println("Felicidades dia concuerda con cedula");
					System.out.println("Total definitivo " + (b-(b*10)/100));

				}	
			}else {
				System.out.println("no paga impuestos");
			}
			break;

		}
		case 3:{
			if (valor>=49849800 & valor<= 68500000) {
				total=(valor*1.3)/100;
				System.out.println("valor a pagar " + total);
				if (persona==1) {
					totalfinal=(total*5)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));
				}else {
					totalfinal=(total*3)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));

				}
				int a =cedula.length()-2;
				cedula.substring(a, cedula.length());
				double b=total-totalfinal;
				if (cedula.substring(a, cedula.length()).equals(dia)){
					System.out.println("Felicidades dia concuerda con cedula");
					System.out.println("Total definitivo " + (b-(b*10)/100));

				}	
			}else {
				System.out.println("no paga impuetsos");
			}
			
			
			break;
		}
		case 4:{
			if (valor>=68480500 & valor<=89560000) {
				total=(valor*1.5)/100;
				System.out.println("valor a pagar " + total);
				if (persona==1) {
					totalfinal=(total*5)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));
				}else {
					totalfinal=(total*3)/100;
					System.out.println("funcionario publico total a pagar " + (total-totalfinal));

				}
				int a =cedula.length()-2;
				cedula.substring(a, cedula.length());
				double b=total-totalfinal;
				if (cedula.substring(a, cedula.length()).equals(dia)){
					System.out.println("Felicidades dia concuerda con cedula");
					System.out.println("Total definitivo " + (b-(b*10)/100));

				}	
			}else {
				System.out.println("no paga impuestos");
			}
			
			
			break;
		}

		default:

		}

	}

}
