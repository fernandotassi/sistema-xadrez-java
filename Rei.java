public class Rei extends PesaXadrez
{
	public Rei(Tabuleiro tabuleiro, Cor cor)
	{super(tabuleiro, cor);}
	
	@Override
	public String toString()
	{return "R";}
	
	public boolean podeMover(Posicao posicao)
	{
		PesaXadrez p = (PesaXadrez)getTabuleiro().pesa(posicao);
		return p == null || p.getCor() != getCor();
	}
	
	@Override
	public boolean[][] movimentosPossiveis()
	{
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		Posicao p =  new Posicao(0, 0);
		
		p.defineValores(posicao.getLinha() - 1, posicao.getColuna());
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha() + 1, posicao.getColuna());
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha(), posicao.getColuna() - 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha(), posicao.getColuna() + 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		p.defineValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
		if(getTabuleiro().posicaoExiste(p) && podeMover(p))
		{mat[p.getLinha()][p.getColuna()] = true;}
		
		return mat;
	}
}
