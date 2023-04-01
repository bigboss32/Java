package marleny;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public final class Ventana extends JFrame implements ActionListener {
    
    JFrame frame;
    JButton b1, b2;
    JTextField tex;
    JPanel panel;
    GridBagConstraints gbc;
    JScrollPane scr1;
            
    
   
    
    public void ventana (){
        
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));
        panel.setBorder(BorderFactory.createTitledBorder("PROCESO"));
        JButton a = new JButton();
       panel.add(a);
  
        gbc = new GridBagConstraints();
         
        b1 = new JButton("INICIAR");
        b1.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(b1, gbc);
        
        b2 = new JButton("COMPROBAR");
        b2.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(b2, gbc);
      
        add(panel);
        
        
    
    }
    
  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== panel) {
            
            b1.setText("");
            b2.setText("");
           
            
        }
    }
    
}