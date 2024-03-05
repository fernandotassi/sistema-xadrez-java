public class PosicaoXadrez 
{
	private int linha;
	private char coluna;
	
	public PosicaoXadrez(int linha, char coluna)
	{
		if(linha < 1 || linha > 8 || coluna < 'a' || coluna > 'h')
		{throw new ExcecaoXadrez("erro somente de a1 à h8!");}
		this.linha = linha; this.coluna = coluna;
	}
	
	public int getLinha(){return linha;}
	public char getColuna(){return coluna;}
    
    protected Posicao paraPosicao()
    {return new Posicao(8 - linha, coluna - 'a');}
    
    protected static PosicaoXadrez daPosicao(Posicao posicao)
    {return new PosicaoXadrez(8 - posicao.getLinha(), (char)('a' - posicao.getColuna()));}
    
    @Override
    public String toString()
    {return "" + coluna + linha;}
}	
