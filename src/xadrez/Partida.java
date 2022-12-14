package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecasxadrez.Cavalo;
import xadrez.pecasxadrez.Dama;
import xadrez.pecasxadrez.Peao;
import xadrez.pecasxadrez.Rainha;
import xadrez.pecasxadrez.Rei;
import xadrez.pecasxadrez.Torre;

public class Partida 
{
	private Tabuleiro tabuleiro;
	
	public Partida(){tabuleiro = new Tabuleiro(8, 8); setandoPartida();}
	
	public PecaXadrez[][] buscaPecas()
	{
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++)
		{
			for(int j = 0; j < tabuleiro.getColunas(); j++)
			{
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}	
		}
		return mat;
	}
	private void setandoPartida()
	{
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.white), new Posicao(0, 0));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Cor.white), new Posicao(0, 4));
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.white), new Posicao(0, 7));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.white), new Posicao(0, 1));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.white), new Posicao(0, 6));
		tabuleiro.colocaPeca(new Rainha(tabuleiro, Cor.white), new Posicao(0, 3));
		tabuleiro.colocaPeca(new Dama(tabuleiro, Cor.white), new Posicao(0, 2));
		tabuleiro.colocaPeca(new Dama(tabuleiro, Cor.white), new Posicao(0, 5));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 0));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 1));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 2));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 3));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 4));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 5));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 6));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.white), new Posicao(1, 7));
		
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.black), new Posicao(7, 0));
		tabuleiro.colocaPeca(new Rei(tabuleiro, Cor.black), new Posicao(7, 3));
		tabuleiro.colocaPeca(new Torre(tabuleiro, Cor.black), new Posicao(7, 7));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.black), new Posicao(7, 1));
		tabuleiro.colocaPeca(new Cavalo(tabuleiro, Cor.black), new Posicao(7, 6));
		tabuleiro.colocaPeca(new Rainha(tabuleiro, Cor.black), new Posicao(7, 4));
		tabuleiro.colocaPeca(new Dama(tabuleiro, Cor.black), new Posicao(7, 2));
		tabuleiro.colocaPeca(new Dama(tabuleiro, Cor.black), new Posicao(7, 5));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 0));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 1));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 2));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 3));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 4));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 5));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 6));
		tabuleiro.colocaPeca(new Peao(tabuleiro, Cor.black), new Posicao(6, 7));
	}
}
