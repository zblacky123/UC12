package br.com.poo.estruturairepeticao;

import javax.swing.JOptionPane;

public class Pares extends JOptionPane {
	
	public static void main(String[] args) {
		
		String inicio, termino, resultado = "";
		inicio = JOptionPane.showInputDialog("Entre com um número");
		
		termino = JOptionPane.showInputDialog("Entre com um outro número");
		/*
		 * os valores que entrarão em inicio e termino veem de elemento 
		 * JOptionPane.showInputDialog no formato de texto. Como iremos
		 * realizar uma contagem com os valores será necessário converte-los
		 * para número inteiro. Assim, usamos a classe Integer com a função
		 * ParseInt e convertemos para número.
		 */
		
		int in = Integer.parseInt(inicio);
		int ter = Integer.parseInt(termino);
		
		for(int i = in; i <= ter ; i++) {
			if(i % 2 == 0) {
				resultado += "\n"+i;
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado, "Números Pares", JOptionPane.INFORMATION_MESSAGE);
	}
}
