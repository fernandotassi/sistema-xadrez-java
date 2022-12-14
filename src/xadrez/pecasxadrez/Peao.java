package xadrez.pecasxadrez;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Peao extends PecaXadrez
{
	public Peao(Tabuleiro tabuleiro, Cor cor){super(tabuleiro, cor);}
	
	public String toString(){return "p";}
}
