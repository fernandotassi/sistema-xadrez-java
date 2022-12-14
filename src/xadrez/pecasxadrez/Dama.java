package xadrez.pecasxadrez;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Dama extends PecaXadrez
{
     public Dama(Tabuleiro tabuleiro, Cor cor){super(tabuleiro, cor);}
	
	 public String toString(){return "d";}
}
