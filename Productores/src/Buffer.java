
public class Buffer {
	private char conntenido;
	private boolean disponible=false;
	public Buffer(){

	}
	//public void poner(char c){
	//	conntenido=c;
	//	disponible=true;
	//}
	//public char recoger(){
	//	if (disponible) {
	//		disponible=false;
	//		return conntenido;
	//	}
	public synchronized void poner(char c){
		while(disponible){
			try {
				wait();
			} catch (Exception e) {

			}
		}
		conntenido=c;
		disponible=true;
		notify();
	}
	public synchronized char recoger(){
		while(!disponible){
			try {
				wait();
			} catch (Exception e) {

			}

		}
		disponible=false;
		notify();
		return conntenido;
	}
}

