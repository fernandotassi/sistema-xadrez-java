public class PartidaXadrez 
{
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez()
	{tabuleiro = new Tabuleiro(8, 8); pesaInicial();}
	
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
	
	public void pesaInicial()
	{
		tabuleiro.colocaPesa(new Torre(tabuleiro, Cor.branco), new Posicao(0, 0));
		tabuleiro.colocaPesa(new Torre(tabuleiro, Cor.branco), new Posicao(0, 7));
		tabuleiro.colocaPesa(new Rei(tabuleiro, Cor.branco), new Posicao(0, 0));
	}
}
