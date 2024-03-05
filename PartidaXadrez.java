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
		colocaNovaPesa(2, 'c', new Torre(tabuleiro, Cor.branco));
		colocaNovaPesa(2, 'd', new Torre(tabuleiro, Cor.branco));
	    colocaNovaPesa(2, 'e', new Torre(tabuleiro, Cor.branco));
	    colocaNovaPesa(1, 'e', new Torre(tabuleiro, Cor.branco));
	    colocaNovaPesa(1, 'd', new Rei(tabuleiro, Cor.branco));
	    
	    colocaNovaPesa(7, 'c', new Torre(tabuleiro, Cor.preto));
		colocaNovaPesa(7, 'd', new Torre(tabuleiro, Cor.preto));
	    colocaNovaPesa(7, 'e', new Torre(tabuleiro, Cor.preto));
	    colocaNovaPesa(8, 'e', new Torre(tabuleiro, Cor.preto));
	    colocaNovaPesa(8, 'd', new Rei(tabuleiro, Cor.preto));
	}
}
