package br.com.fatec;

public class DiaCrianca extends Desconto {
 double valorBaseDesconto = 10;
	
	public DiaCrianca(double valorDesconto) {
		super(valorDesconto);
		this.valorBaseDesconto = valorDesconto;
	}

	@Override
	public double getValorDesconto() {
		return valorBaseDesconto;
	}
}
