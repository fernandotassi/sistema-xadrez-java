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
		Posicao p = new Posicao(0, 0);
		
		p.defineValores(posicao.getLinha() - 1, posicao.getColuna());
		while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().temUmaPesa(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		} 
		
		if(getTabuleiro().posicaoExiste(p) && pesaAdversaria(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.defineValores(posicao.getLinha(), posicao.getColuna() - 1);
		while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().temUmaPesa(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		} 
		
		if(getTabuleiro().posicaoExiste(p) && pesaAdversaria(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.defineValores(posicao.getLinha(), posicao.getColuna() + 1);
		while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().temUmaPesa(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		} 
		
		if(getTabuleiro().posicaoExiste(p) && pesaAdversaria(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		p.defineValores(posicao.getLinha() + 1, posicao.getColuna());
		while(getTabuleiro().posicaoExiste(p) && !getTabuleiro().temUmaPesa(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() + 1);
		} 
		
		if(getTabuleiro().posicaoExiste(p) && pesaAdversaria(p))
		{
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		return mat;
	}
}

