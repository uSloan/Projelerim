import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class uygulama extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Scanner yasal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uygulama frame = new uygulama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public uygulama() {
		ArrayList<Double> liste = new ArrayList<>();
		ArrayList<Double> asallar = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 244, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(49, 13, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton buton = new JButton("EKLE");
		buton.addActionListener(new ActionListener() {int counter = 0;
		int toplam = 0;
			public void actionPerformed(ActionEvent arg0) {
				liste.add((double) Integer.parseInt(textField.getText()));
				textField.setText("");
				counter++;
				if(counter==10) {
					buton.setEnabled(false);
					for(double i:liste) {
						toplam+=i;
						
					}
					for(double a:liste) {
						for(double d=2; d<=a;d++) {
							if(a%d==0) {
								break;
							}asallar.add(a);
							break;
						}
					}
					Collections.sort(liste);
					Collections.sort(asallar);
					JOptionPane.showMessageDialog(null,"En küçük sayý: " + Collections.min(liste));
					JOptionPane.showMessageDialog(null,"En büyük sayý: " + Collections.max(liste));
					JOptionPane.showMessageDialog(null,"Sayýlarýnýzýn sýralanmýþ hali: " + liste);
					JOptionPane.showMessageDialog(null,"Sayýlarýn ortalamasý: " + (toplam/liste.size()));
					JOptionPane.showMessageDialog(null,"Dizideki Asal Sayýlar: " + asallar);
					}
			}
		});
		buton.setBounds(59, 48, 97, 25);
		contentPane.add(buton);
	}

}
