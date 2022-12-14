package application;

import java.util.*;

import tabuleiro.Posicao;

public class Program 
{

	public static void main(String[] args)

	{	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		System.out.println();
		
		Posicao pos = new Posicao(2, 3);
		
		System.out.println(pos);
				
		scan.close();
	}
}
