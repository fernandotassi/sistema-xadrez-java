package aplicacao;

import java.util.*;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.Partida;

public class Programa 
{

	public static void main(String[] args)

	{	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		System.out.println();
		
		Partida partida1 = new Partida();
		UI.mostraTabuleiro(partida1.buscaPecas());
		
		
		
		
		
		
		
		scan.close();
	}
}
