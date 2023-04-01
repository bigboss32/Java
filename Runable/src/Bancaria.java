
public class Bancaria {
private int saldo=50;
public Bancaria() {
	// TODO Auto-generated constructor stub
}
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}

void retirobanco(int retiro){
	saldo=saldo-retiro;
}
}
