package Formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Desafio.Acao;

public class FormularioPrinvcipal {

	public FormularioPrinvcipal(){
		// JFrame
		JFrame formulario = new JFrame("Desafio");
		formulario.setSize(300, 350);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// PRODUTO
		JLabel produto = new JLabel();
		produto.setText("Produto");
		produto.setBounds(30, 10, 150, 30);
		// Campo Produto
		JTextField campoProduto = new JTextField();
		campoProduto.setBounds(100, 10, 100, 30);

		// VALOR
		JLabel valor = new JLabel();
		valor.setText("Valor");
		valor.setBounds(30, 50, 100, 30);
		// Campo valor
		JTextField campoValor = new JTextField();
		campoValor.setBounds(100, 50, 100, 30);

		// QUANTIDADE
		JLabel quantidade = new JLabel();
		quantidade.setText("Quantidade");
		quantidade.setBounds(30, 90, 150, 30);
		// Campo quantidade
		JTextField campoQuant = new JTextField();
		campoQuant.setBounds(100, 90, 100, 30);

		// botao
		JButton botao = new JButton("Cadastrar");
		botao.setBounds(100, 130, 100, 30);


		Acao a = new Acao();

		// JTable - Serve para exibir o DefaultTableModel
		JTable tabela = new JTable(a.exibirDados());

		// Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 200, 260, 100);

		// Botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome = campoProduto.getText().trim();
				double valor = Double.parseDouble(campoValor.getText().trim());
				int quantidade = Integer.parseInt(campoQuant.getText().trim());
				a.cadastrar(nome, valor, quantidade);

				tabela.setModel(a.exibirDados());

			}
		});
		tabela.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

				int linha = tabela.getSelectedRow();
				String nome = tabela.getValueAt(linha, 0).toString();
				double valor = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidade = Integer.parseInt(tabela.getValueAt(linha, 2).toString());

				FormularioAlteracao f = new FormularioAlteracao(nome, valor, quantidade, linha);
				formulario.dispose();

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		

		formulario.add(produto);
		formulario.add(campoProduto);
		formulario.add(valor);
		formulario.add(campoValor);
		formulario.add(quantidade);
		formulario.add(campoQuant);
		formulario.add(botao);
		formulario.add(barraRolagem);

		formulario.setVisible(true);

	}

}
