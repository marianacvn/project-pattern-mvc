package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Usuario;
import view.Login;

public class ControleLogin implements ActionListener{
	Login login1;
	
	public ControleLogin(Login login1) {
		this.login1 = login1;
		login1.getEntrarButton().addActionListener(this);;
		login1.getSairButton().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login1.getEntrarButton()) {
			String login = login1.getLoginField().getText();
			String senha = login1.getSenhaField().getText();
			Usuario usuario = new Usuario(login,senha);
			
			if(BaseDados.verificar(usuario)) {
				JOptionPane.showMessageDialog(null, "Login Realizado", "Sucesso", JOptionPane.WARNING_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Login Inválido", "Falha", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		if(e.getSource()==login1.getSairButton()) {
			System.exit(0);
		}
	}
	

}
