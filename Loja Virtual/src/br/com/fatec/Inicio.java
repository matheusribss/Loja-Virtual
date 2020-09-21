package br.com.fatec;

import java.util.Scanner;

public class Inicio  {
	
	static Scanner myObj = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Produto notebook = new Produto ("Notebook",40);
		Produto shampoo = new Produto ("Shampoo",70);
		Produto camisa = new Produto ("Camisa",200);
		
		Desconto maes = new DiaMaes(30);
		Desconto pais = new DiaPais(20);
		Desconto crianca = new DiaCrianca(50);
		
		System.out.println("Escolha o produto: \n"
				+"0 - Notebook \n"
				+ "1 - Shampoo \n"
				+"2 - Camisa");
			
		int tipoProduto=0;
		
		tipoProduto = myObj.nextInt();
		
		Produto p = null;
		

		switch(tipoProduto) {
			
		case 0:
			p = notebook;
			break;
		case 1:
			p = shampoo;
			break;
		case 2:
			p = camisa;
		}
			
		System.out.println("Preço: "+p.getValor());
		
		
		System.out.println("Aplicando Desconto: \n"
				+"0 - Dia das Maes \n"
				+ "1 - Dia dos Pais \n"
				+"2 - Dia das Crianças\n"
				+"3 - Não Aplicar");
		
		
		int tipoDesconto=0;
		
		tipoDesconto = myObj.nextInt();
		
		CalculadorPreco c = null;
		
		
	
		switch(tipoDesconto) {
		
		case 0:
			  c = new CalculadorPreco (p,maes);
			break;
		case 1:
			 c = new CalculadorPreco (p ,pais);
			break;
		case 2:
			c = new CalculadorPreco (p,crianca);
			break;
		case 3:
			
			
		}
		
		if (tipoDesconto == 3) {
		System.out.println(p.getValor());
		}else {
		System.out.println(c.calcularPrecoFinal());
		}
		
		

	}

}
