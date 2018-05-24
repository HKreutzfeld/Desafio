package Exercicio03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex03 {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame("Exercicio 3");
		formulario.setSize(250, 400);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
				// Pedir nota1
				JLabel nota1 = new JLabel();
				nota1.setText("Informe a 1ªnota");
				nota1.setBounds(30, 30, 120, 10);
				
				// Pedir nota2
				JLabel nota2 = new JLabel();
				nota2.setText("Informe a 2ªnota");
				nota2.setBounds(30, 90, 120, 10);
				
				// Pedir nota3
				JLabel nota3 = new JLabel();
				nota3.setText("Informe a 3ªnota");
				nota3.setBounds(30, 140, 120, 10);
				
				// Pedir not4
				JLabel nota4 = new JLabel();
				nota4.setText("Informe a 4ªnota");
				nota4.setBounds(30, 210, 120, 10);
				
				// Campo1
				JTextField campo1 = new JTextField();
				campo1.setBounds(30, 50, 180, 20);
				
				// Campo2
				JTextField campo2 = new JTextField();
				campo2.setBounds(30, 110, 180, 20);
				
				// Campo3
				JTextField campo3 = new JTextField();
				campo3.setBounds(30, 170, 180, 20);
				
				// Campo4
				JTextField campo4 = new JTextField();
				campo4.setBounds(30, 230, 180, 20);
				
				// JButton
				JButton botao = new JButton("Calcular a média");
				botao.setBounds(75, 300, 100, 40);
				
				// Ação
				botao.addActionListener(new ActionListener() {

					
					
					@Override
					public void actionPerformed(ActionEvent e) {

						if(campo1.getText().trim().equals("") || campo2.getText().trim().equals("") || campo3.getText().trim().equals("") || campo4.getText().trim().equals("")){
							JOptionPane.showMessageDialog(null, "O campo está vazio.");
						}
						try {
							double nota1 = Double.parseDouble(campo1.getText().trim());
							double nota2 = Double.parseDouble(campo2.getText().trim());
							double nota3 = Double.parseDouble(campo3.getText().trim());
							double nota4 = Double.parseDouble(campo4.getText().trim());
							double media = (nota1+nota2+nota3+nota4)/4;
							
							String situacao = "";
							if(media < 5){
								situacao = "Reprovado";
							}else if(media < 7){
								situacao = "Exame";
							}else{
								situacao = "Aprovado";
							}
							JOptionPane.showMessageDialog(null, "Média: "+media+"\nSituação: "+situacao);
							
							
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Erro! Nenhum valor informado");
							
						}
							
					}
				});
				
				formulario.add(campo1);
				formulario.add(campo2);
				formulario.add(campo3);
				formulario.add(campo4);

				formulario.add(nota1);
				formulario.add(nota2);
				formulario.add(nota3);
				formulario.add(nota4);
				
				formulario.add(botao);

				
				formulario.setVisible(true);
				
	}

}
