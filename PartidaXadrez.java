public class PartidaXadrez 
{
	private int turno;
	private Cor jogadorAtual;
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez()
	{
		tabuleiro = new Tabuleiro(8, 8); 
		turno = 1;
		jogadorAtual = Cor.branco;
		pesaInicial();
	}
	
	public int getTurno(){return turno;}
	public Cor getJogadoAtual(){return jogadorAtual;}
	
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
	
	public boolean[][] possiveisMovimentos(PosicaoXadrez posicaoOrigem)
	{
		Posicao posicao = posicaoOrigem.paraPosicao();
		validaPosicaoOrigem(posicao);
		return tabuleiro.pesa(posicao).movimentosPossiveis();
	}
	
	public PesaXadrez executarMovimentoXadrez(PosicaoXadrez posicaoOrigem, PosicaoXadrez posicaoDestino)
	{
		Posicao origem = posicaoOrigem.paraPosicao();
		Posicao destino = posicaoDestino.paraPosicao();
		validaPosicaoOrigem(origem);
		validaPosicaoDestino(origem, destino);
		Pesa pegaPesa = fazMovimento(origem, destino);
		proximoTurno();
		return (PesaXadrez)pegaPesa;
	}
	
	private Pesa fazMovimento(Posicao origem, Posicao destino)
	{
		Pesa p = tabuleiro.removePesa(origem);
		Pesa pesaCapturada = tabuleiro.removePesa(destino);
		tabuleiro.colocaPesa(p, destino);
		return pesaCapturada;
	}
	
	private void validaPosicaoOrigem(Posicao posicao)
	{
		if(!tabuleiro.temUmaPesa(posicao))
		{throw new ExcecaoXadrez("erro, não existe peça na origem!");}
		if(jogadorAtual != ((PesaXadrez)tabuleiro.pesa(posicao)).getCor())
		{throw new ExcecaoXadrez("erro, a peça não é tua!");}
		if(!tabuleiro.pesa(posicao).existeAlgumMovimentoPossivel())
		{throw new ExcecaoXadrez("erro, não é possivel mover a peça!");}
	}
	
	private void validaPosicaoDestino(Posicao origem, Posicao destino)
	{
		if(!tabuleiro.pesa(origem).movimentoPossivel(destino))
		{
			throw new ExcecaoXadrez("erro, esse movimento não é possível!");
		}
	}
	
	private void proximoTurno()
	{
		turno++;
		jogadorAtual = (jogadorAtual == Cor.branco) ? Cor.preto : Cor.branco;
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
