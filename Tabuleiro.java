public class Tabuleiro 
{
	private int linhas;
	private int colunas;
	private Pesa[][] pesas;
	
	public Tabuleiro(int linhas, int colunas)
	{
		if(linhas < 1 || colunas < 1)
		{throw new ExcecaoTabuleiro("erro, linhas e colunas tem que ser pelo menos 1!");}
		this.linhas = linhas; this.colunas = colunas; pesas = new Pesa[linhas][colunas];
	}
	
	public int getLinhas(){return linhas;}
	public int getColunas(){return colunas;}
	
	public Pesa pesa(int linha, int coluna)
	{
		if(!posicaoExiste(linha, coluna))
		{throw new ExcecaoTabuleiro("erro, posicao fora de tabuleiro!");}
		return pesas[linha][coluna];
	}
	public Pesa pesa(Posicao posicao)
	{
		if(!posicaoExiste(posicao))
		{throw new ExcecaoTabuleiro("erro, posicao fora de tabuleiro!");}
		return pesas[posicao.getLinha()][posicao.getColuna()];
	}
	public void colocaPesa(Pesa pesa, Posicao posicao)
	{
		if(temUmaPesa(posicao))
		{throw new ExcecaoTabuleiro("erro, ja tem peça na posição " + posicao);}
		pesas[posicao.getLinha()][posicao.getColuna()] = pesa;
		pesa.posicao = posicao;
	}
	private boolean posicaoExiste(int linha, int coluna)
	{return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;}
	
	public boolean posicaoExiste(Posicao posicao)
	{return posicaoExiste(posicao.getLinha(), posicao.getColuna());}
	
	public boolean temUmaPesa(Posicao posicao)
	{
		if(!posicaoExiste(posicao))
		{throw new ExcecaoTabuleiro("erro, posicao fora de tabuleiro!");}
		return pesa(posicao) != null;
	}
}
