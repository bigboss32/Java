

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Arrays;
import java.util.LinkedList;

public class LienzoParaArrastrarFiguras extends Canvas implements MouseMotionListener{

	private LinkedList<InterfaceFigura> listaFiguras = new LinkedList<InterfaceFigura>();
	InterfaceFigura figuraArrastrandose = null;
	private int xAnteriorRaton;
	private int yAnteriorRaton;
	int y=40,contad=0;
	int poscion[] = new int[10];
	boolean con=true;
	public LienzoParaArrastrarFiguras()
	{
		addMouseMotionListener(this);

	}
	
 void publi(Boolean cona) {
	this.con=cona;

}

	public void addFigura(InterfaceFigura figura)
	{
		listaFiguras.add(figura);
	}
	public void removeFigura(InterfaceFigura figura)
	{
		listaFiguras.remove(figura);
	}


	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(500, 500);
	}

	@Override
	public void paint(Graphics g)
	{
		for (InterfaceFigura figura : listaFiguras)
		{
			figura.dibujate(g);

		}
		int x=40;
		int raya=139;

		if (listaFiguras.size()!=0) {
			g.drawString("CAB", x, 200);
			g.drawString("NULL", x-41, 225);
		}
		for (int i = 0; i < listaFiguras.size(); i++) {
			g.drawRect(x, 200, 50, 50);
			poscion[i]=x;
			g.drawLine(50, 220, raya,220);
			g.drawLine(50, 240, raya,240);
			g.drawLine(50, 240, 70, 235);
			g.drawLine(50,240, 70, 245);
			x=x+60;

			raya=raya+55;

		}
		if (listaFiguras.size()!=0) {
			g.drawString("NULL", x, 250);
			//			g.drawLine(50+x, x, 70, 235);
			g.drawLine(x+25,220, x+15, 230);
			g.drawLine(x+15,215, x+25, 220);

		}

	}


	public void mouseDragged(MouseEvent e)
	{
		if (con==true) {
			if (figuraArrastrandose == null)
			{
				xAnteriorRaton = e.getX();
				yAnteriorRaton = e.getY();
				figuraArrastrandose = dameFigura(e);
			}
			else
			{
				figuraArrastrandose.setPosicion(figuraArrastrandose.getX() + (e.getX() - xAnteriorRaton),figuraArrastrandose.getY() + (e.getY() - yAnteriorRaton));
				xAnteriorRaton = e.getX();
				yAnteriorRaton = e.getY();
				//			System.out.println("x" +xAnteriorRaton);
				//			System.out.println("y" +yAnteriorRaton);


				//			if (contad==listaFiguras.size()) {
				//				contad=0;y=40;
				//			}else{
				//					if (yAnteriorRaton==250) {
				//						figuraArrastrandose.setPosicion(y, 200);
				//						y=y+60;
				//						repaint();
				//						figuraArrastrandose=null;
				//						contad++;
				//						System.out.println(Arrays.toString(poscion));
				//				}
				try {
					for (int i = 0; i < poscion.length; i++) {
						if (poscion[i]==0) {

						} else {
							if (xAnteriorRaton ==poscion[i] && yAnteriorRaton>=120) {
								figuraArrastrandose.setPosicion(poscion[i], 200);

								repaint();
								figuraArrastrandose=null;
								contad=0;
								System.out.println(Arrays.toString(poscion));

							}
						}

					}
				} catch (Exception e2) {
					 
				}




			}
		}

		


		repaint();
	}




private InterfaceFigura dameFigura(MouseEvent e)
{
	for (InterfaceFigura figura : listaFiguras)
	{
		if (figura.estaDentro(e.getX(), e.getY()))
		{
			return figura;
		}
	}

	return null;
}


public void mouseMoved(MouseEvent e)
{
	figuraArrastrandose = null;
}
}
