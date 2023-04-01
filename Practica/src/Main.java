import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int salir=1;
		int a = 0,b = 0,c = 0;
		int servicios;
		int contadouno=0,contadordos = 0,contadortres = 0;
		double descuento = 0;
		double venta=0;
		Scanner leer = new Scanner(System.in);
		while (salir!=0) {
		
			
			System.out.println("PLANES");
			System.out.println("1)BASICO llamadas + 15 GB $ 30.000");
			System.out.println("2)PLUS llamadas + 25 GB $ 45.000");
			System.out.println("3)ILIMITADO llamadas + 45 GB $62.000");
			int planes=leer.nextInt();
			
			System.out.println("SERVICIOS");
			System.out.println("1 Llamadas Internacionales Mas 5%");
			System.out.println("2 Almacenamiento CLOUD Más 7 %");
			System.out.println("3 TODO INCLUIDO Más 15%");
			System.out.println("4 para no aplicar servicos");
			
			 servicios=leer.nextInt();
			System.out.println("Estrato");
			System.out.println("1 y 2 $5.500");
			System.out.println("3 $4.000");
			System.out.println("4 -5 -6 8 %");
			int estrato=leer.nextInt();

			int basico=30000,plus=45000,ilimitado=62000;
			if (planes==1){
				contadouno++;
				if (servicios==1) {
					a++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+basico*0.05+basico;
						System.out.println("el valor es de "+ ((basico+basico*0.05)-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+basico*0.05+basico;
						System.out.println("el valor es de "+ (basico+basico*0.05-4000));
					}
					if (estrato==3) {
						descuento=descuento+basico*0.08;
						venta=venta+basico+(basico*0.05-basico*0.08);
						System.out.println("el valor es de " + (basico+((basico*0.05-basico*0.08))));
					}
				}
				if (servicios==2) {
					b++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+basico*0.07+basico;
						System.out.println("el valor es de "+ (basico+basico*0.07-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+basico*0.07+basico;
						System.out.println("el valor es de "+ (basico+basico*0.07-4000));
					}
					if (estrato==3) {
						descuento=descuento+basico*0.08;
						venta=venta+basico+(basico*0.07-basico*0.08);
						System.out.println("el valor es de " + (basico+((basico*0.07-basico*0.08))));
					}
				}
				if (servicios==3) {
					c++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+basico*0.15+basico;
						System.out.println("el valor es de "+ (basico+basico*0.15-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+basico*0.15+basico;
						System.out.println("el valor es de "+ (basico+basico*0.15-4000));
					}
					if (estrato==3) {
						descuento=descuento+basico*0.08;
						venta=venta+basico+(basico*0.15-basico*0.08);
						System.out.println("el valor es de " + (basico+((basico*0.15-basico*0.08))));
					}
				}
				if (servicios==4) {
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+basico;
						System.out.println("el valor es de "+ (basico-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+basico;
						System.out.println("el valor es de "+ (basico-4000));
					}
					if (estrato==3) {
						descuento=descuento+basico*0.08;
						venta=venta+basico+(basico-basico*0.08);
						System.out.println("el valor es de " + (basico+((basico-basico*0.08))));
					}
				}
			}
			if (planes==2){
				contadordos++;
				if (servicios==1) {
					a++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+plus*0.05+plus;
						System.out.println("el valor es de "+ (plus+plus*0.05-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+plus*0.05+plus;
						System.out.println("el valor es de "+ (plus+plus*0.05-4000));
					}
					if (estrato==3) {
						descuento=descuento+plus*0.08;
						venta=venta+plus+(plus*0.05-plus*0.08);
						System.out.println("el valor es de " + (plus+((plus*0.05-plus*0.08))));
					}
				}
				if (servicios==2) {
					b++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+plus*0.07+plus;
						System.out.println("el valor es de "+ (plus+plus*0.07-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+plus*0.07+plus;
						System.out.println("el valor es de "+ (plus+plus*0.07-4000));
					}
					if (estrato==3) {
						descuento=descuento+plus*0.08;
						venta=venta+plus+(plus*0.07-plus*0.08);
						System.out.println("el valor es de " + (plus+((plus*0.07-plus*0.08))));
					}
				}
				if (servicios==3) {
					c++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+plus*0.15+plus;
						System.out.println("el valor es de "+ (plus+plus*0.15-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+plus*0.15+plus;
						System.out.println("el valor es de "+ (plus+plus*0.15-4000));
					}
					if (estrato==3) {
						descuento=descuento+plus*0.08;
						venta=venta+plus+(plus*0.15-plus*0.08);
						System.out.println("el valor es de " + (plus+((plus*0.15-plus*0.08))));
					}
				}
				if (servicios==4) {
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+plus;
						System.out.println("el valor es de "+ (plus-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+plus;
						System.out.println("el valor es de "+ (plus-4000));
					}
					if (estrato==3) {
						descuento=descuento+plus*0.08;
						venta=venta+plus+(plus-plus*0.08);
						System.out.println("el valor es de " + (plus+((plus-plus*0.08))));
					}
				}
			}
			if (planes==3){
				contadortres++;
				if (servicios==1) {
					a++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+ilimitado*0.05+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.05-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+ilimitado*0.05+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.05-4000));
					}
					if (estrato==3) {
						descuento=descuento+ilimitado*0.08;
						venta=venta+ilimitado+(ilimitado*0.05-ilimitado*0.08);
						System.out.println("el valor es de " + (ilimitado+((ilimitado*0.05-ilimitado*0.08))));
					}
				}
				if (servicios==2) {
					b++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+ilimitado*0.07+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.07-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+ilimitado*0.07+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.07-4000));
					}
					if (estrato==3) {
						descuento=descuento+ilimitado*0.08;
						venta=venta+ilimitado+(ilimitado*0.07-ilimitado*0.08);
						System.out.println("el valor es de " + (ilimitado+((ilimitado*0.07-ilimitado*0.08))));
					}
				}
				if (servicios==3) {
					c++;
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+ilimitado*0.15+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.15-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+ilimitado*0.15+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado*0.15-4000));
					}
					if (estrato==3) {
						descuento=descuento+ilimitado*0.08;
						venta=venta+ilimitado+(ilimitado*0.15-plus*0.08);
						System.out.println("el valor es de " + (ilimitado+((ilimitado*0.15-ilimitado*0.08))));
					}
				}
				if (servicios==4) {
					if (estrato==1) {
						descuento= descuento + 5500;
						venta=venta+ilimitado;
						System.out.println("el valor es de "+ (ilimitado+ilimitado-5500));

					}
					if (estrato==2) {
						descuento= descuento + 4000;
						venta=venta+ilimitado;
						System.out.println("el valor es de "+ (ilimitado-4000));
					}
					if (estrato==3) {
						descuento=descuento+plus*0.08;
						venta=venta+ilimitado+(ilimitado-ilimitado*0.08);
						System.out.println("el valor es de " + (ilimitado+((ilimitado-ilimitado*0.08))));
					}
				}
			}
			System.out.println("salir presine 0");
			salir=leer.nextInt();
			
		}
	


		System.out.println("total ventas " + venta);
		System.out.println("total descuento " + descuento);
		System.out.println("totla  servico 1=" + a);
		System.out.println("totla  servico 2=" + b);
		System.out.println("totla  servico 3=" + c);
		System.out.println("plan 1=" +contadouno);
		System.out.println("plan 2=" + contadordos);
		System.out.println("plan 3=" + contadortres);
	}

}
