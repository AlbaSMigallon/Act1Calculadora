import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculadora extends JFrame {

	private JPanel contentPane;
	// variables
	public JLabel lblOperaciones;
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn0, btnC;
	public JButton btnMenos, btnMas, btnPor, btnDividir, btnIgual;

	public String operando1 = "0";
	public String operando2 = "";
	public String operador;
	public Double resultado = 0.0;
	public int coma = 0;

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
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOperaciones = new JLabel("");
		lblOperaciones.setForeground(Color.BLACK);
		lblOperaciones.setBackground(Color.WHITE);
		lblOperaciones.setBounds(53, 11, 197, 72);
		contentPane.add(lblOperaciones);

		JButton btnC = new JButton("C");
		btnC.setBackground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblOperaciones.setText("");
				operador = "";
				operando1 = "0";
				operando2 = "0";

			}
		});
		btnC.setBounds(301, 11, 72, 66);
		contentPane.add(btnC);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "9");
			}
		});
		btn9.setBounds(301, 102, 72, 66);
		contentPane.add(btn9);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "7");
			}
		});
		btn7.setBounds(53, 102, 72, 66);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "8");
			}
		});
		btn8.setBounds(178, 102, 72, 66);
		contentPane.add(btn8);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "4");
			}
		});
		btn4.setBounds(53, 185, 72, 66);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "5");
			}
		});
		btn5.setBounds(178, 185, 72, 66);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "6");
			}
		});
		btn6.setBounds(301, 185, 72, 66);
		contentPane.add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "1");
			}
		});
		btn1.setBounds(53, 280, 72, 66);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "2");
			}
		});
		btn2.setBounds(178, 280, 72, 66);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "3");
			}
		});
		btn3.setBounds(301, 280, 72, 66);
		contentPane.add(btn3);

		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (coma == 0) {
					lblOperaciones.setText(lblOperaciones.getText() + ".");
				}
				coma++;
			}
		});
		btnPunto.setBounds(53, 380, 72, 66);
		contentPane.add(btnPunto);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "0");
			}
		});
		btn0.setBounds(178, 380, 72, 66);
		contentPane.add(btn0);

		JButton btnMas = new JButton("+");
		btnMas.setBackground(Color.WHITE);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "+";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
			}
		});
		btnMas.setBounds(53, 475, 72, 66);
		contentPane.add(btnMas);

		JButton btnMenos = new JButton("-");
		btnMenos.setBackground(Color.WHITE);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "-";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
			}
		});
		btnMenos.setBounds(135, 475, 72, 66);
		contentPane.add(btnMenos);

		JButton btnPor = new JButton("x");
		btnPor.setBackground(Color.WHITE);
		btnPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "x";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}

				lblOperaciones.setText("");
			}
		});
		btnPor.setBounds(217, 475, 72, 66);
		contentPane.add(btnPor);

		JButton btnDividir = new JButton("/");
		btnDividir.setBackground(Color.WHITE);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "/";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
			}
		});
		btnDividir.setBounds(301, 475, 72, 66);
		contentPane.add(btnDividir);
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operando2 = lblOperaciones.getText();
				lblOperaciones.setText("");
				switch (operador) {
				case "+":
					resultado = Double.valueOf(operando1) + Double.valueOf(operando2);
					break;
				case "-":
					resultado = Double.valueOf(operando1) - Double.valueOf(operando2);
					break;
				case "x":
					resultado = Double.valueOf(operando1) * Double.valueOf(operando2);
					break;
				case "/":
					resultado = Double.valueOf(operando1) / Double.valueOf(operando2);
					break;
				}// fin switch
				operando1 = String.valueOf(resultado);
				lblOperaciones.setText(operando1);
			}
		});
		btnIgual.setBounds(301, 380, 72, 66);
		contentPane.add(btnIgual);
	}
}
