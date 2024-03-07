public abstract class PesaXadrez extends Pesa 
{
	private Cor cor;
	
	public PesaXadrez(Tabuleiro tabuleiro, Cor cor)
	{super(tabuleiro); this.cor = cor;}
	
	public Cor getCor(){return cor;}
}
