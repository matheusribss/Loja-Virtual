package br.com.fatec;

public abstract class Desconto {
	protected double valorDesconto;
	protected double valorPorcentagem;
	
	
	public Desconto( double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public abstract double getValorDesconto();
	
	
	
}
