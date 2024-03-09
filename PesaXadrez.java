public abstract class PesaXadrez extends Pesa 
{
	private Cor cor;
	
	public PesaXadrez(Tabuleiro tabuleiro, Cor cor)
	{super(tabuleiro); this.cor = cor;}
	
	public Cor getCor(){return cor;}
	
	protected boolean pesaAdversaria(Posicao posicao)
	{
		PesaXadrez p = (PesaXadrez)getTabuleiro().pesa(posicao);
		return p != null && p.getCor() != cor;
	}
}
