package random;
import java.util.Random;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.List;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Color;

public class rndbtn extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rndbtn frame = new rndbtn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public rndbtn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);		
		contentPane.setLayout(null);
		List list = new List();
		list.setBackground(Color.LIGHT_GRAY);
		list.setBounds(10, 47, 101, 163);
		contentPane.add(list);
		List list_1 = new List();
		list_1.setBackground(Color.LIGHT_GRAY);
		list_1.setBounds(262, 48, 109, 162);
		contentPane.add(list_1);
		
		JButton btnNewButton = new JButton("Random Say\u0131");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(117, 47, 137, 163);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
			    int sayi = rnd.nextInt(100);
			    String sayi1 = Integer.toString(sayi);
				
				if(sayi==50) {
				JOptionPane.showMessageDialog(null,"Sayiniz = " + sayi);
				}
				else if(sayi < 50) {
				list.add(sayi1);
			     				
				}
				else if(sayi > 50) {
			    list_1.add(sayi1);
					
				}
			}
			
		});
		contentPane.add(btnNewButton);	
		
		JLabel lblDenKk = new JLabel("50 den k\u00FC\u00E7\u00FCk");
		lblDenKk.setBounds(12, 13, 99, 28);
		contentPane.add(lblDenKk);
		
		JLabel lblDenByk = new JLabel("50 den b\u00FCy\u00FCk");
		lblDenByk.setBounds(270, 16, 101, 22);
		contentPane.add(lblDenByk);
	}
}
