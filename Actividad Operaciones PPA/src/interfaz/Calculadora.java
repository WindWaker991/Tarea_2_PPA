package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 63, 200, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(50, 120, 200, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Primer Numero");
		lblNewLabel.setBounds(50, 40, 92, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblSegundoNmero = new JLabel("Segundo Numero");
		lblSegundoNmero.setBounds(50, 102, 92, 13);
		contentPane.add(lblSegundoNmero);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JFrame jFrame = new JFrame();
					JOptionPane.showMessageDialog(jFrame, "Debes ingresar valores a los dos campos.");
					// AGREGAR CONDICIONALES DE SUMA
				}
			}
		});
		btnNewButton.setBounds(50, 173, 85, 21);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JFrame jFrame = new JFrame();
					JOptionPane.showMessageDialog(jFrame, "Debes ingresar valores a los dos campos.");
					// AGREGAR CONDICIONALES DE RESTA
				}
			}
		});
		btnNewButton_1.setBounds(165, 173, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JFrame jFrame = new JFrame();
					JOptionPane.showMessageDialog(jFrame, "Debes ingresar valores a los dos campos.");
					// AGREGAR CONDICIONALES DE MULTIPLICACIÓN
				}
			}
		});
		btnNewButton_2.setBounds(50, 208, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("") || textField_1.getText().equals("")) {
					JFrame jFrame = new JFrame();
					JOptionPane.showMessageDialog(jFrame, "Debes ingresar valores a los dos campos.");
					// AGREGAR CONDICIONALES DE DIVISION
				}
			}
		});
		btnNewButton_3.setBounds(165, 208, 85, 21);
		contentPane.add(btnNewButton_3);
	}
}
