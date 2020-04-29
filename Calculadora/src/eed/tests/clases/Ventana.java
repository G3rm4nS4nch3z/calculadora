package eed.tests.clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField o1;
	private JTextField o2;
	private JTextField r1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 251);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperador = new JLabel("Operador 2");
		lblOperador.setBackground(Color.CYAN);
		lblOperador.setBounds(39, 56, 90, 30);
		contentPane.add(lblOperador);
		
		o1 = new JTextField();
		o1.setBackground(Color.CYAN);
		o1.setBounds(141, 17, 116, 22);
		contentPane.add(o1);
		o1.setColumns(10);
		
		JLabel lblOperador_1 = new JLabel("Operador 1");
		lblOperador_1.setBackground(Color.CYAN);
		lblOperador_1.setBounds(39, 13, 90, 30);
		contentPane.add(lblOperador_1);
		
		o2 = new JTextField();
		o2.setBackground(Color.CYAN);
		o2.setColumns(10);
		o2.setBounds(141, 60, 116, 22);
		contentPane.add(o2);
		
		JButton suma = new JButton("+");
		suma.setBackground(Color.MAGENTA);
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones oper =new Operaciones();
				r1.setText(String.valueOf(oper.sumar(Integer.parseInt(o1.getText()),Integer.parseInt(o2.getText()))));
			}
		});
		suma.setBounds(39, 111, 97, 25);
		contentPane.add(suma);
		
		JButton resta = new JButton("-");
		resta.setBackground(Color.MAGENTA);
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones oper =new Operaciones();
				r1.setText(String.valueOf(oper.restar(Integer.parseInt(o1.getText()),Integer.parseInt(o2.getText()))));
			}
		});
		resta.setBounds(152, 111, 97, 25);
		contentPane.add(resta);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(39, 151, 90, 30);
		contentPane.add(lblResultado);
		
		r1 = new JTextField();
		r1.setBackground(Color.CYAN);
		r1.setBounds(141, 155, 116, 22);
		contentPane.add(r1);
		r1.setColumns(10);
	}
}
