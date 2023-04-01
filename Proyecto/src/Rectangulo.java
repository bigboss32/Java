
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Rectangulo implements InterfaceFigura
{

	private int x;
	private int y;
	private int ancho;
	private int alto;  
	private Color color;

	String info;


	public Rectangulo(int x, int y, int alto, int ancho, Color color, String info)
	{
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
		this.info= info;
	}


	public void dibujate(Graphics g)
	{
		g.setFont(new Font("Arial Black",10,13));
		g.setColor(color);
		g.fillRect(x, y, ancho, alto);
		g.drawString(info, x, y+70); 


	}


	public boolean estaDentro(int x, int y)
	{
		if (
				(x > this.x) && (x < (this.x + ancho)) && (y > this.y) &&
				(y < (this.y + alto)))
		{
			return true;
		}

		return false;
	}


	public void setPosicion(int x, int y)
	{
		this.x = x;
		this.y = y;
	}


	public int getX()
	{
		return x;
	}


	public int getY()
	{
		return y;
	}
}
