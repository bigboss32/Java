import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int c = 0,b=0,c1=0,d=0, e=0,f=0 ,g=0,bandera=1,peso;
		double valortotal = 0,IMC,altura;
		Scanner leer= new Scanner(System.in);
	
		while (bandera==1) {


			System.out.println("digite su peso en kg");
			peso=leer.nextInt();
			System.out.println("digite su altura");
			 altura=leer.nextDouble();
			System.out.println("elige el plan");
			System.out.println("1)individual");
			System.out.println("2)PAREJA (2)");
			System.out.println("3)AMIGOS (4)");
			System.out.println("4)salir");
			int planes,servicios;
			planes=leer.nextInt();
			IMC=peso/(altura*altura);
			switch (planes) {
			case 1: {
				c1++;
				System.out.println("servicios");
				System.out.println("1)CROSS TRAINNIG");
				System.out.println("2)MAQUINARIA");
				System.out.println("3)TODO INCLUIDO");
				servicios=leer.nextInt();
				switch (servicios) {
				case 1: {
					e++;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+140000-140000*0.05;
						System.out.println("el valor es " +(140000-140000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+140000-140000*0.02;
							System.out.println("el valor es " +(140000-140000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+140000-140000*0.10;
								System.out.println("el valor es " +(140000-140000*0.10));
							}
						}
					}


					break;
				}
				case 2: {
					b++;
					double a=140000+140000*0.07;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-140000*0.05;
						System.out.println("el valor es " +(a-140000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-140000*0.02;
							System.out.println("el valor es " +(a-140000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-140000*0.10;
								System.out.println("el valor es " +(a-140000*0.10));
							}
						}
					}

					break;
				}
				case 3: {
					c1++;
					double a=140000+140000*0.15;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-140000*0.05;
						System.out.println("el valor es " +(a-140000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-140000*0.02;
							System.out.println("el valor es " +(a-140000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-140000*0.10;
								System.out.println("el valor es " +(a-140000*0.10));
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
			case 2:{
				f++;
				System.out.println("servicios");
				System.out.println("1)CROSS TRAINNIG");
				System.out.println("2)MAQUINARIA");
				System.out.println("3)TODO INCLUIDO");
				servicios=leer.nextInt();
				switch (servicios) {
				case 1: {
					e++;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+250000-250000*0.05;
						System.out.println("el valor es " +(250000-250000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+250000-250000*0.02;
							System.out.println("el valor es " +(250000-250000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+250000-250000*0.10;
								System.out.println("el valor es " +(250000-250000*0.10));
								d++;
							}
						}
					}


					break;


				}
				case 2: {
					b++;
					double a=250000+250000*0.07;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-250000*0.05;
						System.out.println("el valor es " +(a-250000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-250000*0.02;
							System.out.println("el valor es " +(a-250000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-250000*0.10;
								System.out.println("el valor es " +(a-250000*0.10));
								d++;
							}
						}
					}
					break;
				}
				case 3: {
					c1++;
					double a=250000+250000*0.15;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-250000*0.05;
						System.out.println("el valor es " +(a-250000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-250000*0.02;
							System.out.println("el valor es " +(a-250000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-250000*0.10;
								System.out.println("el valor es " +(a-250000*0.10));
								d++;
							}
						}
					}

					break;
				}
				default:

				}
				break;
			}
			case 3:{
				g++;
				System.out.println("servicios");
				System.out.println("1)CROSS TRAINNIG");
				System.out.println("2)MAQUINARIA");
				System.out.println("3)TODO INCLUIDO");
				servicios=leer.nextInt();
				switch (servicios) {
				case 1: {
					e++;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+480000-480000*0.05;
						System.out.println("el valor es " +(480000-480000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+480000-480000*0.02;
							System.out.println("el valor es " +(480000-480000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+480000-480000*0.10;
								System.out.println("el valor es " +(480000-480000*0.10));

							}
						}
					}

					break;
				}
				case 2: {
					b++;
					double a=480000+480000*0.07;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-480000*0.05;
						System.out.println("el valor es " +(a-480000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-480000*0.02;
							System.out.println("el valor es " +(a-480000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-480000*0.10;
								System.out.println("el valor es " +(a-480000*0.10));
							}
						}
					}

					break;
				}
				case 3: {
					c1++;
					double a=480000+480000*0.15;
					if (IMC<=18.4) {
						System.out.println("bajo de peso" +IMC);
						valortotal=valortotal+a-480000*0.05;
						System.out.println("el valor es " +(a-480000*0.05));
					}else {
						if (IMC<=24.9){
							System.out.println("pesonormal" +IMC);
							valortotal=valortotal+a-480000*0.02;
							System.out.println("el valor es " +(a-480000*0.02));

						}else {
							if (IMC>=30 && IMC<=40) {
								System.out.println("sobrepeso" +IMC);
								valortotal=valortotal+a-480000*0.10;
								System.out.println("el valor es " +(a-480000*0.10));
							}
						}
					}


					break;
				}
				default:

				}

				break;
			}

			default:
				bandera=0;
			}
		}
		System.out.println("Cantidad de plan individual:"+c1);
		System.out.println("Cantidad de plan pareja"+f);
		System.out.println("Cantidad de plan amigos:"+g);
		System.out.println("Cantidad de servicio cross training:"+ e);
		System.out.println("Cantidad de servicio maquinaria"+ b);
		System.out.println("Cantidad de servicio todo incluido"+c1);
		System.out.println("Cantidad de plan pareja acreedores al 10% de descuento:"+d);
		System.out.println("Total recaudado a lo largo del día"+valortotal);
	}

}
