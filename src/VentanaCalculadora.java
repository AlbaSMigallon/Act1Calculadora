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
import java.awt.Font;

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
		setBounds(100, 100, 400, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOperaciones = new JLabel("");
		lblOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblOperaciones.setForeground(Color.BLACK);
		lblOperaciones.setBackground(new Color(192, 192, 192));
		lblOperaciones.setBounds(33, 36, 216, 66);
		contentPane.add(lblOperaciones);

		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBackground(new Color(176, 224, 230));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblOperaciones.setText("");
				operador = "";
				operando1 = "0";
				operando2 = "0";

			}
		});
		btnC.setBounds(278, 36, 72, 66);
		contentPane.add(btnC);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(245, 245, 220));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "9");
			}
		});
		btn9.setBounds(278, 122, 72, 66);
		contentPane.add(btn9);

		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(245, 245, 220));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "7");
			}
		});
		btn7.setBounds(32, 122, 72, 66);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(245, 245, 220));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "8");
			}
		});
		btn8.setBounds(153, 122, 72, 66);
		contentPane.add(btn8);

		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(245, 245, 220));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "4");
			}
		});
		btn4.setBounds(32, 198, 72, 66);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(245, 245, 220));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "5");
			}
		});
		btn5.setBounds(153, 198, 72, 66);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(245, 245, 220));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "6");
			}
		});
		btn6.setBounds(278, 198, 72, 66);
		contentPane.add(btn6);

		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(245, 245, 220));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "1");
			}
		});
		btn1.setBounds(33, 274, 72, 66);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(245, 245, 220));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "2");
			}
		});
		btn2.setBounds(153, 274, 72, 66);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(245, 245, 220));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "3");
			}
		});
		btn3.setBounds(278, 274, 72, 66);
		contentPane.add(btn3);

		JButton btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPunto.setBackground(new Color(176, 224, 230));
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (coma == 0) {
					lblOperaciones.setText(lblOperaciones.getText() + ".");
				}
				coma++;
			}
		});
		btnPunto.setBounds(32, 350, 72, 66);
		contentPane.add(btnPunto);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn0.setBackground(new Color(245, 245, 220));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOperaciones.setText(lblOperaciones.getText() + "0");
			}
		});
		btn0.setBounds(153, 350, 72, 66);
		contentPane.add(btn0);

		JButton btnMas = new JButton("+");
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMas.setBackground(new Color(176, 224, 230));
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "+";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
				lblOperaciones.setText("");
			}
		});
		btnMas.setBounds(32, 441, 72, 66);
		contentPane.add(btnMas);

		JButton btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMenos.setBackground(new Color(176, 224, 230));
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "-";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
				lblOperaciones.setText("");
			}
		});
		btnMenos.setBounds(114, 441, 72, 66);
		contentPane.add(btnMenos);

		JButton btnPor = new JButton("x");
		btnPor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPor.setBackground(new Color(176, 224, 230));
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
		btnPor.setBounds(196, 441, 72, 66);
		contentPane.add(btnPor);

		JButton btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDividir.setBackground(new Color(176, 224, 230));
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coma = 0;
				operador = "/";
				if (lblOperaciones.getText().isEmpty()) {
					operando1 = "0";
				}else {
					operando1 = lblOperaciones.getText();
				}
				lblOperaciones.setText("");
			}
		});
		btnDividir.setBounds(278, 441, 72, 66);
		contentPane.add(btnDividir);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnIgual.setBackground(new Color(176, 224, 230));
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
		btnIgual.setBounds(278, 350, 72, 66);
		contentPane.add(btnIgual);
	}
}
