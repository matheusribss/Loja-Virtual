package br.com.fatec;

public class DiaPais extends Desconto {
	double valorBaseDesconto = 20;
	
	public DiaPais(double valorDesconto) {
		super(valorDesconto);
		this.valorBaseDesconto = valorDesconto;
	}

	@Override
	public double getValorDesconto() {
		return valorBaseDesconto;
	}
}
