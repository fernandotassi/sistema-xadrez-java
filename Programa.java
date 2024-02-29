
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Programa
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Date d = new Date();
		System.out.println(d);
		
		int l = 5;
		int c = 7;
		
		Posicao pos = new Posicao(l, c);
		System.out.println(pos);
	
	
	
	
		scan.close();
	}
	
}
