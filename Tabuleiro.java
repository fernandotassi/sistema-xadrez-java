public class Tabuleiro 
{
	private int linhas;
	private int colunas;
	private Pesa[][] pesas;
	
	public Tabuleiro(int linhas, int colunas)
	{this.linhas = linhas; this.colunas = colunas; pesas = new Pesa[linhas][colunas];}
	
	public void setLinhas(int linhas){this.linhas = linhas;}
	public void setColunas(int colunas){this.colunas = colunas;}
	
	public int getLinhas(){return linhas;}
	public int getColunas(){return colunas;}
}
