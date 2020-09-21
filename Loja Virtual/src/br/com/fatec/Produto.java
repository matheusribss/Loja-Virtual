package br.com.fatec;




public class Produto {
	private String nome;
	private double valor;
	
	// calcular valor aqui
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
		//this.valorDesconto = valorDesconto;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
