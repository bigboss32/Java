
public class Auto {
String placa;
int tiempo;

public Auto(String plca) {

	this.placa = plca;
}


public Auto(String placa, int tiempo) {
	this.placa = placa;
	this.tiempo = tiempo;
}


@Override
public String toString() {
	return "Auto [placa=" + placa + ", tiempo=" + tiempo + "]";
}


public Auto() {

}


}
