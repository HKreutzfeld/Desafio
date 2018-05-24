package Exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex02 {

	public static void main(String[] args) {

		//JFrame
				JFrame formulario = new JFrame("Exercicio 2");
				formulario.setSize(500, 150);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setLayout(null);
				formulario.setLocationRelativeTo(null);
				
				JLabel preco = new JLabel();
				preco.setText("Informe o valor a pagar");
				preco.setBounds(30, 30, 200, 20);
				
				JTextField campo = new JTextField();
				campo.setBounds(250, 30, 180, 20);
		
				
				// JButton
				JButton botao = new JButton("Confirmar");
				//pocição horizontal,vertical,tamanho do botao horizontal e vertical
				botao.setBounds(180, 55, 100, 40);
				
				// Ação
				botao.addActionListener(new ActionListener() {

					
					
					@Override
					public void actionPerformed(ActionEvent e) {

						if(campo.getText().trim().equals("")){
							JOptionPane.showMessageDialog(null, "O campo está vazio.");
						}
						try {
							double valor = Double.parseDouble(campo.getText());
							JOptionPane.showMessageDialog(null, "Valor: "+(valor*0.9));
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Erro! Nenhum valor informado");
							
						}
							
					}
				});
				
				formulario.add(preco);
				formulario.add(botao);
				formulario.add(campo);
				
				
				formulario.setVisible(true);
	}

}
