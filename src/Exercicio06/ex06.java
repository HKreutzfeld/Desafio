package Exercicio06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex06 {

	public static void main(String[] args) {

		//JFrame
				JFrame formulario = new JFrame("Exercicio 6");
				formulario.setSize(250, 150);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setLayout(null);
				formulario.setLocationRelativeTo(null);
		
				//Número
				JLabel numero = new JLabel();
				numero.setText("informe dois números quaisquer");
				numero.setBounds(30, 10, 300, 20);

				//Campo1
				JTextField campo1 = new JTextField();
				campo1.setBounds(50, 40, 60, 20);
				
				//Campo2
				JTextField campo2 = new JTextField();
				campo2.setBounds(120, 40, 60, 20);
				
				//botao
				JButton botao = new JButton("Calcular");
				botao.setBounds(60, 70, 100, 30);
				
				//Ação
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							double valor1 = Double.parseDouble(campo1.getText());
							double valor2 = Double.parseDouble(campo2.getText());
							
							double resultado = 0;
							if(campo1.getText().trim().equals(campo2)){
								resultado = valor1+valor2;
							}else{
								resultado = valor1*valor2;
							}
							JOptionPane.showMessageDialog(null, "O resultado é: "+resultado);
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Erro! Informe os número");
						}
						
					}
				});
				
				
				
				formulario.add(numero);
				formulario.add(campo1);
				formulario.add(campo2);
				formulario.add(botao);
				
				formulario.setVisible(true);
				
	}

}
