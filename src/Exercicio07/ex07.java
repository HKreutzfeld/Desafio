package Exercicio07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex07 {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame("Exercicio 7");
		formulario.setSize(250, 130);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		//Número
		JLabel numero = new JLabel();
		numero.setText("Informe um número");
		numero.setBounds(30, 10, 150, 30);
		
		//Campo do Número
		JTextField campoNumero = new JTextField();
		campoNumero.setBounds(30, 40, 60, 20);
		
		//botao
		JButton botao = new JButton("Calcular");
		botao.setBounds(100, 35, 90, 30);
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int valor = Integer.parseInt(campoNumero.getText());
					
					String resultado = "";
					for (int i = 1; i <= 10; i++) {
						resultado += valor+" x "+i+" = "+(valor*i)+"\n";
					} 
					JOptionPane.showMessageDialog(null, resultado);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro!");
				}
				
			}
		});
		
		
		formulario.add(numero);
		formulario.add(campoNumero);
		formulario.add(botao);
		
		formulario.setVisible(true);
	}

}
