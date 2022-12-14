package tabuleiro;

import tabuleiro.TabuleiroExcessao;

public class Tabuleiro
{
	private Integer linhas;
	private Integer colunas;
	private Peca[][] peca;
	
	public Tabuleiro(Integer linhas, Integer colunas)
	{
		if(linhas < 1 || colunas < 1)
		{throw new TabuleiroExcessao("Pelo menis uma linha e uma coluna!");}	
			
		this.linhas = linhas; this.colunas = colunas; peca = new Peca[linhas][colunas];
	}
		
	public Integer getLinhas(){return  linhas;}
	
	public Integer getColunas(){return colunas;}
	
	public Peca peca(Integer linha, Integer coluna)
	{
		if(!posicaoExiste(linha, coluna))
		{throw new TabuleiroExcessao("Posição não existe no tabuleiro!");}	
		
		return peca[linha][coluna];
    }
	
	public Peca peca(Posicao posicao)
	{
		if(!posicaoExiste(posicao))
		{throw new TabuleiroExcessao("Posição não existe no tabuleiro!");}	
		
		return peca[posicao.getLinha()][posicao.getColuna()];}
	
	public void colocaPeca(Peca peca, Posicao posicao)
	{
		if(temUmaPeca(posicao))
		{throw new TabuleiroExcessao("Já tem uma peça ai!" + posicao);}
		
		this.peca[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(Integer linha, Integer coluna)
	{return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;}
	
	public boolean posicaoExiste(Posicao posicao)
	{return posicaoExiste(posicao.getLinha(), posicao.getColuna());}
	
	public boolean temUmaPeca(Posicao posicao)
	{ 
		if(!posicaoExiste(posicao))
		{throw new TabuleiroExcessao("Posição não existe no tabuleiro!");}	
		
		return peca(posicao) != null;		
	}
}
