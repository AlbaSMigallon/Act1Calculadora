import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;

public class VentanaCalculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculadora frame = new VentanaCalculadora();
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
	public VentanaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperaciones = new JLabel("");
		lblOperaciones.setForeground(Color.BLACK);
		lblOperaciones.setBackground(Color.WHITE);
		lblOperaciones.setBounds(53, 11, 197, 72);
		contentPane.add(lblOperaciones);
		
		JButton btnNewButtonC = new JButton("C");
		btnNewButtonC.setBounds(301, 11, 72, 66);
		contentPane.add(btnNewButtonC);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(301, 102, 72, 66);
		contentPane.add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(53, 102, 72, 66);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(178, 102, 72, 66);
		contentPane.add(btn8);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(53, 185, 72, 66);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(178, 185, 72, 66);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(301, 185, 72, 66);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(53, 280, 72, 66);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(178, 280, 72, 66);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(301, 280, 72, 66);
		contentPane.add(btn3);
		
		JButton btnPunto = new JButton(".");
		btnPunto.setBounds(53, 380, 72, 66);
		contentPane.add(btnPunto);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(178, 380, 72, 66);
		contentPane.add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(301, 380, 72, 66);
		contentPane.add(btnIgual);
		
		JButton btnMas = new JButton("+");
		btnMas.setBounds(53, 475, 72, 66);
		contentPane.add(btnMas);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBounds(135, 475, 72, 66);
		contentPane.add(btnMenos);
		
		JButton btnPor = new JButton("x");
		btnPor.setBounds(217, 475, 72, 66);
		contentPane.add(btnPor);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(301, 475, 72, 66);
		contentPane.add(btnDividir);
	}
}

