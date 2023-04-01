import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
public class Ventana extends JFrame implements ActionListener {

	   Metodosfec fecc = new Metodosfec();

	    JPanel p1, p2, p3, p4;
	    JTextField t1;
	    JButton b1;
	    JDateChooser ingresarFec;

	    Date fec;
	    public Ventana() {

	        setTitle("titulo"); // poner titulo a la ventana 
	        setResizable(true); // no permite que el usuario modifique el tamaño de la ventana 
	        setBounds(200, 10, 500, 300); // poner tamaño y posicion de la ventana 1.posocion, 2.tamaño
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        Paneles();
	        Etiquetas();

	        Botones();

	        setVisible(true);

	    }

	    public void Paneles() {
	        p1 = new JPanel();

	        this.add(p1);

	    }

	    public void Etiquetas() {

	        Date a = new Date();

	        t1 = new JTextField();
	        t1.setPreferredSize(new Dimension(300, 30));
//	        t1.setText(fecc.getFecha());
	        ingresarFec = new JDateChooser();
	        ingresarFec.setMaxSelectableDate(a);

//	        p1.add(ingresarFec);
	        p1.add(t1);
	    }

	    public void Botones() {
	        b1 = new JButton("mostrar fecha");
	        b1.addActionListener(this);

	        p1.add(b1);
	    }

	    @Override
	    public void actionPerformed(ActionEvent ae) {

	        if (ae.getSource() == b1) {
//
//	            Calendar fechaActual = Calendar.getInstance();
//
//	            int year = ingresarFec.getCalendar().get(Calendar.YEAR);
//	            int mes = ingresarFec.getCalendar().get(Calendar.MONTH);
//	            int dia = ingresarFec.getCalendar().get(Calendar.DAY_OF_MONTH);
//                                 
//
//
//	            int numDias = fechaActual.getActualMaximum(Calendar.DAY_OF_MONTH); // dias del mes actual


//	            System.out.println(year+""+mes+""+dia);
	            ingresarFec.setEnabled(false);

	        }
	    }
}
