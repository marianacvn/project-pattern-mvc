package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel loginLabel, senhaLabel;
	JTextField loginField, senhaField;
	JButton entrarButton, sairButton;
	
	
	
	public Login() {
		super("Login");
		
		setSize(200, 280);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		loginLabel = new JLabel("Login");
		senhaLabel = new JLabel("Senha");
		loginField = new JTextField(10);
		senhaField = new JTextField(10);
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		add(sairButton);
		
		
		
		setVisible(true);
	}



	


	public JTextField getLoginField() {
		return loginField;
	}



	public JTextField getSenhaField() {
		return senhaField;
	}



	public JButton getEntrarButton() {
		return entrarButton;
	}



	public JButton getSairButton() {
		return sairButton;
	}

	
	
}
