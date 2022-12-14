package tabuleiro;

public class Tabuleiro
{
	private Integer linhas;
	private Integer colunas;
	private Peca[][] peca;
	
	public Tabuleiro(Integer linhas, Integer colunas)
	{this.linhas = linhas; this.colunas = colunas; peca = new Peca[linhas][colunas];}
	
	public void setLinhas(Integer linhas){this.linhas = linhas;}
	
	public void setColunas(Integer colunas){this.colunas = colunas;}
	
	public Integer getLinhas(){return  linhas;}
	
	public Integer getColunas(){return colunas;}
}
