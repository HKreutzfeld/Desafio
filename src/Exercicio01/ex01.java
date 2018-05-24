package Exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex01 {

	public static void main(String[] args) {

		// JFrame
		//Titulo
		JFrame formulario = new JFrame("Exercício 01");
		//Tamanho 
		formulario.setSize(500, 220);
		//Quando clica em "X" fecha
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sempre vai
		formulario.setLayout(null);
		//centraliza
		formulario.setLocationRelativeTo(null);

		// Pedir nome
		JLabel nome = new JLabel();
		nome.setText("Informe seu nome");
		nome.setBounds(30, 30, 120, 10);

		// Pedir idade
		JLabel idade = new JLabel();
		idade.setText("Informe sua idade");
		idade.setBounds(30, 60, 120, 30);

		// Pedir cidade onde mora
		JLabel cidade = new JLabel();
		cidade.setText("Informe a cidade que você mora");
		cidade.setBounds(30, 90, 230, 30);

		// Campo
		JTextField campo = new JTextField();
		campo.setBounds(250, 30, 180, 20);

		// Campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(250, 60, 180, 20);

		// Campo2
		JTextField campo2 = new JTextField();
		campo2.setBounds(250, 90, 180, 20);

		// JButton
		JButton botao = new JButton("Confirmar");
		botao.setBounds(180, 130, 100, 40);

		// Ação
		botao.addActionListener(new ActionListener() {

			
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().trim().equals("") || campo1.getText().trim().equals("") || campo2.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null, "Um dos campos está vazio.");
				}else{
					String result = campo.getText()+ " mora em "+campo2.getText()+" e tem "+campo1.getText()+" anos." ;
					JOptionPane.showMessageDialog(null, result);
				}
				
				

				
			}
		});

		// adicionar ao JFrame
		formulario.add(nome);
		formulario.add(idade);
		formulario.add(cidade);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);
		
		// Exibir o formulario
		formulario.setVisible(true);

	}

}
