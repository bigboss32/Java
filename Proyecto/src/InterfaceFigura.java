

import java.awt.Graphics;

public interface InterfaceFigura
{
   
    public boolean estaDentro(int x, int y);

  
    public void setPosicion(int x, int y);

    
    public int getX();

   
    public int getY();

    public void dibujate(Graphics g);
}
