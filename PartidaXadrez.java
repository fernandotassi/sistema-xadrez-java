public class PartidaXadrez 
{
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez()
	{tabuleiro = new Tabuleiro(8, 8);}
	
	public PesaXadrez[][] getPesas()
	{
		PesaXadrez[][] mat = new PesaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i < tabuleiro.getLinhas(); i++)
        {
			for(int j = 0; j < tabuleiro.getColunas(); j++)
			{
				mat[i][j] = (PesaXadrez) tabuleiro.pesa(i, j);
			}
		}
		return mat;	
	}
}
