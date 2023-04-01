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
	   * Para darle un tamaño por defecto al Canvas de dibujo
	   *
	   * @return Dimension por defecto.
	   */
	   @Override
	   public Dimension getPreferredSize()
	   {
	      return new Dimension(1000, 1000);
	   }

	   /**
	    * Dibuja el rectángulo en la posición indicada por por xRectangulo e
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
* Para ver si el ratón está dentro del rectángulo.
* Si está dentro, puede comenzar el arrastre.
*
* @param e El evento de ratón
*
* @return true si el ratón está dentro del rectángulo
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
       // ... y el ratón está dentro del rectángulo
       if (estaDentro(e))
       {
          // Se guardan las posiciones del ratón
          xAnteriorRaton = e.getX();
          yAnteriorRaton = e.getY();
          // y se marca que ha comenzado el arrastre.
          arrastrando = true;
       }
    }
    else
    {   
       // Si ya había empezado el arrastre, se calculan las nuevas
       // coordenadas del rectángulo
       xRectangulo = (xRectangulo + e.getX()) - xAnteriorRaton;
       yRectangulo = (yRectangulo + e.getY()) - yAnteriorRaton;
 
       // Se guarda la posición del ratón para el siguiente cálculo
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
