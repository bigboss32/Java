package Swing;


public class Operaciones {
	Numero m=new Numero() ;
	int suma(int a,int b){ 
		m.setA(a);
		m.setB(b);
		return m.getA()+m.getB();
	}
	int resta(int a,int b){
		m.setA(a);
		m.setB(b);
		return m.getA()-m.getB();
	}
	int multipli(int a,int b){
		m.setA(a);
		m.setB(b);
		return m.getA()*m.getB();

	}
	double divis(int a, int b){
		m.setA(a);
		m.setB(b);
		return (double)(m.getA())/(double)(m.getB());

	}

}
