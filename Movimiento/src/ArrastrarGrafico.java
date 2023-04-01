import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ArrastrarGrafico  extends Canvas implements  MouseMotionListener{
	 // posicion x,y del rectangulo, asi como su alto y ancho
	   int xRectangulo = 100; 
	   int yRectangulo = 100; 
	   private int anchoRectangulo = 100; 
	   private int altoRectangulo = 100;
	   private boolean arrastrando = false;
	   private int xAnteriorRaton;
	   private int yAnteriorRaton;
	  /**
	   * Para darle un tama�o por defecto al Canvas de dibujo
	   *
	   * @return Dimension por defecto.
	   */
	   @Override
	   public Dimension getPreferredSize()
	   {
	      return new Dimension(1000, 1000);
	   }

	   /**
	    * Dibuja el rect�ngulo en la posici�n indicada por por xRectangulo e
	    * yRectangulo.
	    *
	    * @param g Graphics con el que dibujar.
	    */
	   @Override
	   public void paint(Graphics g)
	   {
	      g.setColor(Color.blue);
	      g.fillRect(xRectangulo, yRectangulo, anchoRectangulo, altoRectangulo);
	      
	   }


/**
* Para ver si el rat�n est� dentro del rect�ngulo.
* Si est� dentro, puede comenzar el arrastre.
*
* @param e El evento de rat�n
*
* @return true si el rat�n est� dentro del rect�ngulo
*/
private boolean estaDentro(MouseEvent e)
{
   if (
      (e.getX() > xRectangulo) &&
      (e.getX() < (xRectangulo + anchoRectangulo)) &&
      (e.getY() > yRectangulo) &&
      (e.getY() < (yRectangulo + altoRectangulo)))
   {
      return true;
   }
  return false;
}

@Override
public void mouseDragged(MouseEvent e) {
	   // Si comienza el arrastre ...
    if (!arrastrando)
    {
       // ... y el rat�n est� dentro del rect�ngulo
       if (estaDentro(e))
       {
          // Se guardan las posiciones del rat�n
          xAnteriorRaton = e.getX();
          yAnteriorRaton = e.getY();
          // y se marca que ha comenzado el arrastre.
          arrastrando = true;
       }
    }
    else
    {   
       // Si ya hab�a empezado el arrastre, se calculan las nuevas
       // coordenadas del rect�ngulo
       xRectangulo = (xRectangulo + e.getX()) - xAnteriorRaton;
       yRectangulo = (yRectangulo + e.getY()) - yAnteriorRaton;
 
       // Se guarda la posici�n del rat�n para el siguiente c�lculo
       xAnteriorRaton = e.getX();
       yAnteriorRaton = e.getY();
 
       // y se manda repintar el Canvas
       repaint();
    }
	
}

@Override
public void mouseMoved(MouseEvent e) {
	arrastrando = false;
	
}
public ArrastrarGrafico()
{
   addMouseMotionListener(this);
}
}
