package Desafio;


import javax.swing.table.DefaultTableModel;

public class Acao {
	
	
	public void cadastrar(String nome, double valor, int quantidade){
		
		
		Produto p = new Produto();
		p.setNomeProduto(nome);
		p.setValorProduto(valor);
		p.setQuantidadeProduto(quantidade);
		
		//Adicionar no ArrayList
		Produto.dados.add(p);
		
	}
	//Metodo para retornar dados do produto
	public DefaultTableModel exibirDados(){
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");
		
		for (int i = 0; i < Produto.dados.size(); i++) {
			modelo.addRow(new Object[]{
					Produto.dados.get(i).getNomeProduto(),
					Produto.dados.get(i).getvalorProduto(),
					Produto.dados.get(i).getQuantidadeProduto()
					
			});
		}
		return modelo;
		
		}
	//Metodo para excluir linha
	public void excluir(int linha){
		Produto.dados.remove(linha);	
	
	}
	public void alterar(String nome, double valor, int quantidade, int linha){
		Produto p = new Produto();
		p.setNomeProduto(nome);
		p.setValorProduto(valor);
		p.setQuantidadeProduto(quantidade);
		
		
		
		Produto.dados.set(linha, p);
	}

	
}
