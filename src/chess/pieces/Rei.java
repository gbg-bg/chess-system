package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import tabuleiro.Tabuleiro;

public class Rei extends ChessPiece {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getTabuleiro().getRows()][getTabuleiro().getColumns()];
		return mat;
	}

}
