import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana() {
		ArrastrarGrafico m= new ArrastrarGrafico();
		ArrastrarGrafico e= new ArrastrarGrafico();
		
		setBounds(400,500,500,500);
		add(m);
	 
		add(e);
		
	
	}
}
