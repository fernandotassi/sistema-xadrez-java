public class UI 
{
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
		if(pesa == null)
		{System.out.print("-");}
		else
		{System.out.print(pesa);}
		System.out.print(" ");
	 }
}
