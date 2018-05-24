package Desafio;

import java.util.ArrayList;

public class Produto {

	private String nome;
	private double valor;
	private int quantidade;

	static ArrayList<Produto> dados = new ArrayList<Produto>();

	public String getNomeProduto() {
		return nome;
	}
	public void setNomeProduto(String nome) {
		this.nome = nome;
	}
	public double getvalorProduto(){
		return valor;
	}
	public void setValorProduto(double valor){
		this.valor=valor;
	}
	public int getQuantidadeProduto(){
		return quantidade;
	}
	public void setQuantidadeProduto(int quantidade){
		this.quantidade=quantidade;
	}







}