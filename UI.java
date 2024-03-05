
import java.util.*;

public class UI 
{
	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static PosicaoXadrez lerPosicaoXadrez(Scanner scan)
	{
		try
		{
			String s = scan.nextLine();
			int linha = Integer.parseInt(s.substring(1));
			char coluna = s.charAt(0);
			return new PosicaoXadrez(linha, coluna);
	    }
	    catch(RuntimeException e){throw new InputMismatchException("erro, valores validos de 1a á 8h");}
	}
	
	public static void imprimeTabuleiro(PesaXadrez[][] pesas)
	{
		for(int i = 0; i < pesas.length; i++)
		{
			System.out.print((8 - i) + " ");
			for(int j = 0; j < pesas.length; j++)
			{
				imprimePesa(pesas[i][j]);
			}	
			System.out.println();	
		}
		System.out.println("  a b c d e f g h");
	 }
	 private static void imprimePesa(PesaXadrez pesa)
	 {
		if (pesa == null) {
            System.out.print("-");
        }
        else {
            if (pesa.getCor() == Cor.branco) {
                System.out.print(ANSI_CYAN + pesa + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_RED + pesa + ANSI_RESET);
            }
        }
        System.out.print(" ");
	 }
}
