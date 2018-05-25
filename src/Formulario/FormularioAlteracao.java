package Formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Desafio.Acao;
import Desafio.Produto;

public class FormularioAlteracao {

	public FormularioAlteracao(String nome, double valor, int quantidade, int linha) {
		
		// JFrame
				JFrame formulario = new JFrame("Alterar produto");
				formulario.setSize(500, 200);
				formulario.setLayout(null);
				formulario.setLocationRelativeTo(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// Componentes para realizar o cadastro
				JLabel lblNomeProduto = new JLabel("Nome do produto:");
				JLabel lblValorProduto = new JLabel("Valor do produto:");
				JLabel lblQuantidadeProduto = new JLabel("Quantidade do produto:");
				JTextField txtNomeProduto = new JTextField(nome);
				JTextField txtValorProduto = new JTextField(String.valueOf(valor));
				JTextField txtQuantidadeProduto = new JTextField(String.valueOf(quantidade));
				
				lblNomeProduto.setBounds(80, 10, 120, 20);
				lblValorProduto.setBounds(80, 40, 120, 20);
				lblQuantidadeProduto.setBounds(80, 70, 150, 20);
				txtNomeProduto.setBounds(220, 10, 200, 20);
				txtValorProduto.setBounds(220, 40, 200, 20);
				txtQuantidadeProduto.setBounds(220, 70, 200, 20);
				
				// JButton
				JButton btnAlterar = new JButton("Alterar Produto");
				JButton btnExcluir = new JButton("Excluir Produto");
				JButton btnCancelar = new JButton("Cancelar");

				btnAlterar.setBounds(20, 130, 140, 20);
				btnExcluir.setBounds(170, 130, 140, 20);
				btnCancelar.setBounds(320, 130, 140, 20);
				
				
				//Ação para alterar
				btnAlterar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String nome = txtNomeProduto.getText();
						double valor = Double.parseDouble(txtValorProduto.getText());
						int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
						
						//Ação para alterar
						Acao a = new Acao();
						a.alterar(nome, valor, quantidade, linha);
						//Fechar o formulario
						formulario.dispose();
						
						//Chamar o formulario principal
						FormularioPrinvcipal fp = new FormularioPrinvcipal();
						
					}
				});

				//Ação excluir
				btnExcluir.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Ação excluir
						Acao a = new Acao();
						a.excluir(linha);
						
						//Fechar
						formulario.dispose();
						
						//Chamar formulario Principal
						FormularioPrinvcipal fp = new FormularioPrinvcipal();
						
					}
				});
				
				//Ação cancelar
				btnCancelar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Fechar formulari atual
						formulario.dispose();
						
						FormularioPrinvcipal fp = new FormularioPrinvcipal();
						
						
					}
				});
				
				
				// Adicionar elemenetos ao JFrame
				formulario.add(lblNomeProduto);
				formulario.add(lblValorProduto);
				formulario.add(lblQuantidadeProduto);
				formulario.add(txtNomeProduto);
				formulario.add(txtValorProduto);
				formulario.add(txtQuantidadeProduto);
				formulario.add(btnAlterar);
				formulario.add(btnExcluir);
				formulario.add(btnCancelar);
						
				// Exibir Estrutura
				formulario.setVisible(true);
				
	}

}
