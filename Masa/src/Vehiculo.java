import java.util.Scanner;

public class Vehiculo {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese cedula");
		String cedula=leer.next();
		System.out.println(cedula.substring(0, 2));
		System.out.println("ingrese dia");
		String dia=leer.next();
		System.out.println("ingrese mes");
		String mes=leer.next();
		System.out.println("ingrese año");
		String año=leer.next();
		System.out.println("Tipo de vehiculo");
		System.out.println("1)vehiculo particulares");
		System.out.println("2)Motociletas");
		System.out.println("3)vehiculo publicos");
		System.out.println("4)terminar");
		int opcion= leer.nextInt();
		int valor,cilendraje;
		double axu=0,porcentaje=0;
		switch (opcion) {
		case 1: {
			System.out.println("Tipo de vehiculos particulares");
			System.out.println("1)Automóviles");
			System.out.println("2)camperos");
			System.out.println("3)camionetas");
			System.out.println("4)vehículos de carga" );
			System.out.println("5)pasajeros");
			opcion= leer.nextInt();
			System.out.println("valor del vehiculo");
			valor=leer.nextInt();
			switch (opcion) {
			case 1: {
				if (valor<=39051000) {
					axu= (1.5*valor)/100;
					System.out.println("tarifa 1 es " + axu +" total a pagar ");
					System.out.println("Fecha "+dia+"/"+mes+"/"+año);
					System.out.println("Cedula" + cedula);
					if (cedula.substring(0,2).equals(dia)) {
						System.out.println("felicidades se aplica descuento del 10%");
						porcentaje=axu*10/100;
						System.out.println("total a pagar " +(axu-porcentaje));
					}

				}else{
					if (valor<=87866000) {						
						axu= (2.5*valor)/100;
						System.out.println("tarifa 2 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}else {
						axu= (3.5*valor)/100;
						System.out.println("tarifa 3 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}

				}
				break;	
			}
			case 2: {
				if (valor<=39051000) {
					axu= (1.5*valor)/100;
					System.out.println("tarifa 1 es " + axu +" total a pagar ");
					System.out.println("Fecha "+dia+"/"+mes+"/"+año);
					System.out.println("Cedula" + cedula);
					if (cedula.substring(0,2).equals(dia)) {
						System.out.println("felicidades se aplica descuento del 10%");
						porcentaje=axu*10/100;
						System.out.println("total a pagar " +(axu-porcentaje));
					}

				}else{
					if (valor<=87866000) {
						axu= (2.5*valor)/100;
						System.out.println("tarifa 2 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}else {
						axu= (3.5*valor)/100;
						System.out.println("tarifa 3 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}

				}
				break;	
			}
			case 3: {
				if (valor<=39051000) {
					axu= (1.5*valor)/100;
					System.out.println("tarifa 1 es " + axu +" total a pagar ");
					System.out.println("Fecha "+dia+"/"+mes+"/"+año);
					System.out.println("Cedula" + cedula);
					if (cedula.substring(0,2).equals(dia)) {
						System.out.println("felicidades se aplica descuento del 10%");
						porcentaje=axu*10/100;
						System.out.println("total a pagar " +(axu-porcentaje));
					}

				}else{
					if (valor<=87866000) {
						axu= (2.5*valor)/100;
						System.out.println("tarifa 2 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}else {
						axu= (3.5*valor)/100;
						System.out.println("tarifa 3 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}

				}

				break;	
			}
			case 4: {
				if (valor<=39051000) {
					axu= (1.5*valor)/100;
					System.out.println("tarifa 1 es " + axu +" total a pagar ");
					System.out.println("Fecha "+dia+"/"+mes+"/"+año);
					System.out.println("Cedula" + cedula);
					if (cedula.substring(0,2).equals(dia)) {
						System.out.println("felicidades se aplica descuento del 10%");
						porcentaje=axu*10/100;
						System.out.println("total a pagar " +(axu-porcentaje));
					}

				}else{
					if (valor<=87866000) {
						axu= (2.5*valor)/100;
						System.out.println("tarifa 1 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}else {
						axu= (3.5*valor)/100;
						System.out.println("tarifa 1 es " + axu +" total a pagar ");
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}

				}
				break;	
			}
			case 5: {
				if (valor<=39051000) {
					axu= (1.5*valor)/100;
					System.out.println("tarifa 1 es " + axu +" total a pagar ");
					System.out.println("Fecha "+dia+"/"+mes+"/"+año);
					System.out.println("Cedula" + cedula);
					if (cedula.substring(0,2).equals(dia)) {
						System.out.println("felicidades se aplica descuento del 10%");
						porcentaje=axu*10/100;
						System.out.println("total a pagar " +(axu-porcentaje));
					}

				}else{
					if (valor<=87866000) {
						axu= (2.5*valor)/100;
						System.out.println("tarifa 1 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}else {
						axu= (3.5*valor)/100;
						System.out.println("tarifa 1 es " + axu +" total a pagar ");
						System.out.println("Fecha "+dia+"/"+mes+"/"+año);
						System.out.println("Cedula" + cedula);
						if (cedula.substring(0,2).equals(dia)) {
							System.out.println("felicidades se aplica descuento del 10%");
							porcentaje=axu*10/100;
							System.out.println("total a pagar " +(axu-porcentaje));
						}
					}

				}
				break;	
			}
			default:
				break;	
			}
			break;	
		}
		case 2: {
			System.out.println("cilendraje de la motocicleta");
			cilendraje=leer.nextInt();
			System.out.println("valor de la moto");
			valor=leer.nextInt();
			if (cilendraje<125) {
				axu= (0.8*valor)/100;
				System.out.println("tarifa 1 es " + axu +" total a pagar ");
				System.out.println("Fecha "+dia+"/"+mes+"/"+año);
				System.out.println("Cedula" + cedula);
				if (cedula.substring(0,2).equals(dia)) {
					System.out.println("felicidades se aplica descuento del 10%");
					porcentaje=axu*5/100;
					System.out.println("total a pagar "+(axu-porcentaje));
				}
			}else{
				axu= (1.5*valor)/100;
				System.out.println("tarifa 1 es " + axu +" total a pagar ");
				System.out.println("Fecha "+dia+"/"+mes+"/"+año);
				System.out.println("Cedula" + cedula);
				if (cedula.substring(0,2).equals(dia)) {
					System.out.println("felicidades se aplica descuento del 10%");
					porcentaje=axu*5/100;
					System.out.println("total a pagar " +(axu-porcentaje));
				}
			}

			break;	
		}
		case 3: {
			System.out.println("VEHÍCULOS PÚBLICOS valor ");
			valor=leer.nextInt();
			System.out.println();
			axu= (0.5*valor)/100;
			System.out.println("tarifa 1 es " + axu +" total a pagar ");
			System.out.println("Fecha "+dia+"/"+mes+"/"+año);
			System.out.println("Cedula" + cedula);
			if (cedula.substring(0,2).equals(dia)) {
				System.out.println("felicidades se aplica descuento del 10%");
				porcentaje=axu*7/100;
				System.out.println("total a pagar " +(axu-porcentaje));
			}

		}
		break;	
		default:

		}

	}

}
