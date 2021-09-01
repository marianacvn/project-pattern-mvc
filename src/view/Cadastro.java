package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {
	JLabel loginJLabel, senhaJLabel, confLabel;
	JTextField loginField, senhaField, confField;
	JButton cadastrarButton,  voltarButton;
	
	public Cadastro() {
		super("Cadastro");
		
		setSize(200, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		loginJLabel = new JLabel("Login");
		senhaJLabel = new JLabel("Senha");
		confLabel = new JLabel("Confirmar senha");
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		confField = new JTextField(10);
		cadastrarButton = new JButton();
		voltarButton = new JButton();
		
		
		add(loginJLabel);
		add(loginField);
		add(senhaJLabel);
		add(senhaField);
		add(confLabel);
		add(confField);
		
		
		setVisible(true);
		
		
	}

}
