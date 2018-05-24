package Exercicio04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ex04 {

	public static void main(String[] args) {

		//JFrame
				JFrame formulario = new JFrame("Exercicio 4");
				formulario.setSize(250, 350);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setLayout(null);
				formulario.setLocationRelativeTo(null);
				
				//Nome do produto
				JLabel nomeProduto = new JLabel();
				nomeProduto.setText("Nome do produto");
				nomeProduto.setBounds(30, 30, 120, 10);
				
				//Campo1
				JTextField campo1 = new JTextField();
				campo1.setBounds(30, 50, 180, 20);
				
				//Nome do Preço
				JLabel precoProduto = new JLabel();
				precoProduto.setText("Preço do produto");
				precoProduto.setBounds(30, 100, 120, 10);
				
				//Campo2
				JTextField campo2 = new JTextField();
				campo2.setBounds(30, 120, 180, 20);
				
				
				//JButton
				JButton botao = new JButton("Calcular desconto");
				botao.setBounds(30, 270, 180, 20);
				
				//ComboBox
				JComboBox<String> combo = new JComboBox<>();
				combo.setBounds(30,180,180,20);
				combo.addItem("A vista");
				combo.addItem("A prazo");
				
				//Ação
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						try {
							if(campo1.getText().trim().equals("") || campo2.getText().trim().equals("")){
								JOptionPane.showMessageDialog(null, "Erro! Um dos campos esta vazio");
							}else{
								double precoProduto = Double.parseDouble(campo2.getText().trim());
								String selecionado = (String) combo.getSelectedItem();
								String desconto = "";
								if (precoProduto >= 500 && selecionado.equals("A vista")) {
									desconto = "Voce tem 10% de desconto, o preço final é:  R$ "+(precoProduto*0.9);
								}else{
									desconto = "O preço a pagar é: "+precoProduto;
								}
								JOptionPane.showMessageDialog(null, desconto );

							}
														
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Erro! Preço informado inválido.");
						}
					}
				});
		
				formulario.add(campo1);
				formulario.add(campo2);
				formulario.add(nomeProduto);
				formulario.add(precoProduto);
				formulario.add(combo);
				
				formulario.add(botao);

				formulario.setVisible(true);
	}

}
