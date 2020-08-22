package chess.pieces;

import chess.ChessPiece;
import chess.Color;
import tabuleiro.Tabuleiro;

public class Torre extends ChessPiece{

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);		
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getTabuleiro().getRows()][getTabuleiro().getColumns()];
		return mat;
	}
	
}
