public class Pesa 
{
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Pesa(Tabuleiro tabuleiro)
	{this.tabuleiro = tabuleiro; posicao = null;}
	
	protected Tabuleiro getTabuleiro(){return tabuleiro;}
	
}
