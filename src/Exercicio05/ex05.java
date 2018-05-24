package Exercicio05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex05 {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame("Exercicio 5");
		formulario.setSize(250, 130);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		//Dia do mês
		JLabel dia = new JLabel();
		dia.setText("informe um dia qualquer");
		dia.setBounds(50, 10, 250, 20);

		//Campo1
		JTextField campo = new JTextField();
		campo.setBounds(100, 30, 30, 20);
		
		
		//botao
		JButton botao = new JButton("Verificar dia");
		botao.setBounds(60, 60, 110, 20);
		
		//Ação 
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(campo.getText().trim().equals("2") || campo.getText().trim().equals("3") || campo.getText().trim().equals("9") || campo.getText().trim().equals("10") || campo.getText().trim().equals("16")|| campo.getText().trim().equals("17")|| campo.getText().trim().equals("23")|| campo.getText().trim().equals("24")){
						JOptionPane.showMessageDialog(null, "Fim de samana!");
					}else{
						JOptionPane.showMessageDialog(null, "Dia de semana");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro! Informe um dia em número.");
				}
				
			}
		});

		formulario.add(dia);
		formulario.add(campo);
		formulario.add(botao);
		
		formulario.setVisible(true);
	}

}
