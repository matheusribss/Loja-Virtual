package br.com.fatec;

public  class CalculadorPreco {
	
	protected Desconto d;
	protected Produto p;
	protected double porcentagem;

	public CalculadorPreco(Produto p,Desconto d) {
		super();
		this.p = p;
		this.d = d;

	}
	
	
	
	public  double calcularPrecoFinal() {
	 porcentagem = p.getValor() * (d.getValorDesconto()/100);
	 return  p.getValor()- porcentagem ;
		
		
		
		
	}
	
	

	
	
	
	

}
