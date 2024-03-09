
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;
import java.util.*;

public class Programa
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		while(true)
		{
			try
			{
				UI.limpaTela();
				UI.imprimeTabuleiro(partidaXadrez.getPesas());
				System.out.println();
				System.out.print("Origem: ");
				PosicaoXadrez origem = UI.lerPosicaoXadrez(scan);
				boolean[][] possiveisMovimentos = partidaXadrez.possiveisMovimentos(origem);
				UI.limpaTela();
				UI.imprimeTabuleiro(partidaXadrez.getPesas(), possiveisMovimentos);
				System.out.println();
				System.out.print("Destino: ");
				PosicaoXadrez destino = UI.lerPosicaoXadrez(scan);
				PesaXadrez capturada = partidaXadrez.executarMovimentoXadrez(origem, destino);
		    }   		    
		    catch(ExcecaoXadrez e){System.out.println(e.getMessage()); scan.nextLine();}
		    catch(InputMismatchException e){System.out.println(e.getMessage()); scan.nextLine();}
	    }
	
		//scan.close();
	}
	
}
