package ola.ucsal;

import java.util.Scanner;

public class Basiquinho {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		int n1,n2,operacao;
		System.out.println("digite um numero: ");
		n1 = entradaDados.nextInt();
		System.out.println("digite outro numero: ");
		n2 = entradaDados.nextInt();
		//escolher o operador
		System.out.println("escolha agora um operador:"
				+ "\n (1) SOMA"
				+ "\n (2) SUBTRA��O"
				+ "\n (3) MULTIPLICA��O"
				+ "\n (4) DIVIS�O");
		
		operacao = entradaDados.nextInt();
		
		if (operacao == 1) {
			System.out.println("o resultado � " + (n1+n2));
		}else if (operacao == 2){
			System.out.println("o resultado e " + (n1-n2));
		}else if (operacao == 3){
			System.out.println("o resultado � " + (n1*n2));
		}else if (operacao == 4){
			System.out.println("o resultado � " + (n1/n2));
		}else {
			System.out.println("opera�ao inv�lida!");
		}
	}
}
