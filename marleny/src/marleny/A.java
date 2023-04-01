package marleny;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.ImageIcon;

public class A extends JFrame {

	public A() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(A.class.getResource("/marleny/e90f6237ad16279bb59f3b3dea459eae44b831b5_hq.gif")));
		lblNewLabel.setBounds(104, 43, 192, 180);
		getContentPane().add(lblNewLabel);
	}
}
