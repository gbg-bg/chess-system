package chess;

import tabuleiro.Tabuleiro;

public class ChessMatch {

	private Tabuleiro tabuleiro;
	
	public ChessMatch() {
		tabuleiro = new Tabuleiro(8, 8);
		
	}
	
	public ChessPiece[][] getPieces() {
			ChessPiece[][] mat = new ChessPiece[tabuleiro.getRows()][tabuleiro.getColumns()];
			for (int i=0; i<tabuleiro.getRows(); i++) {
				for (int j=0; j<tabuleiro.getColumns(); j++) {
					mat[i][j] = (ChessPiece) tabuleiro.piece(i, j);
																			
				}
			}
			return mat;
						
	}
	
}
