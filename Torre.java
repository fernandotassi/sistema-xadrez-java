public class Torre extends PesaXadrez
{
	public Torre(Tabuleiro tabuleiro, Cor cor)
	{super(tabuleiro, cor);}
	
	@Override
	public String toString()
	{return "T";}
	
	@Override
	public boolean[][] movimentosPossiveis()
	{
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
}

