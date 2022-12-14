package xadrez.pecasxadrez;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rainha extends PecaXadrez
{
     public Rainha(Tabuleiro tabuleiro, Cor cor){super(tabuleiro, cor);}
	
	 public String toString(){return "r";}
}
