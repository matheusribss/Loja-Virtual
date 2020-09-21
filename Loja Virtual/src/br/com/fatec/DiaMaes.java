package br.com.fatec;

public class DiaMaes extends Desconto {
	
	double valorBaseDesconto = 10;
	
	public DiaMaes(double valorDesconto) {
		super(valorDesconto);
		this.valorBaseDesconto = valorDesconto;
	}

	@Override
	public double getValorDesconto() {
		return valorBaseDesconto;
	}
	
	
	
	
	
	

	
	
	

	
	

	
	

	

}
