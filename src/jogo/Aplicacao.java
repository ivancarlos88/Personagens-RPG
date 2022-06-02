package jogo;

import java.util.Scanner;

import personagens.Guerreiro;
import personagens.Mago;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		//For n= numero de per
		//new atributo 6
		//Classe(entrada0, entrada2, entrada3)
		
		
		Guerreiro guerreiro1 = new Guerreiro(1, 800, 40, 0, 120, 100);
		Mago mago1 = new Mago(1, 800, 40, 0, 120, 100);
		
		int personagem = 0;
		
		System.out.println("Escolha o personagem \n1 - Guerreiro \n2 - Mago");
		switch (personagem) {
		case 1:
			System.out.println("Seus status iniciais!");
			guerreiro1.statusGuerreiro();
			
			break;

		case 2:
			System.out.println("Seus status iniciais!");
			
			break;
		}
	}

}
