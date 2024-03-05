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
	
	private void colocaNovaPesa(int linha, char coluna, PesaXadrez pesa)
	{tabuleiro.colocaPesa(pesa, new PosicaoXadrez(linha, coluna).paraPosicao());}
	
	public void pesaInicial()
	{
		colocaNovaPesa(8, 'a', new Torre(tabuleiro, Cor.branco));
		colocaNovaPesa(8, 'h', new Torre(tabuleiro, Cor.branco));
	    colocaNovaPesa(8, 'e', new Rei(tabuleiro, Cor.branco));
	}
}
