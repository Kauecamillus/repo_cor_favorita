package corfavorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
	Scanner entrada = new Scanner(System.in);
	
		int corfavorita;
		
		System.out.println("Qual sua cor favorita?");
		System.out.println("Digite 1 para Azul.");
		System.out.println("Digite 2 para Vermelho.");
		System.out.println("Digite 3 para Amarelo.");
		System.out.println("Digite 4 para Branco.");
		System.out.println("Digite 5 para Preto.");
		System.out.println("Digite 6 para nenhuma das alternativas.");
		corfavorita = entrada.nextInt();
		
		if (corfavorita >= 7) {
			System.out.println("ERROR...");
			System.out.println("OPÇÃO INVÁLIDA...");
			System.out.println("AUTO DESTRUIÇÃO EM ATIVADA!");
			entrada.close();
		} else {
		
			switch (corfavorita) {
			
			case 1:
				System.out.println("A cor favorita do usuário é Azul.");
				break;
			case 2:
				System.out.println("A cor favorita do usuário é Vermelho.");
				break;
			case 3: 
				System.out.println("A cor favorita do usuário é Amarelo.");
				break;
			case 4: 
				System.out.println("A cor favorita do usuário é Branco.");
				break;
			case 5:
				System.out.println("A cor favorita do usuário é Preto.");
				break;
			default:
				System.out.println("A cor favorita do usuário não esta listada.");
				break;
			}
		
			entrada.close();
			
		}

	}

}
