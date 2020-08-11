package chess;

import chess.pieces.Rei;
import chess.pieces.Torre;
import tabuleiro.Tabuleiro;

public class ChessMatch {

	private Tabuleiro tabuleiro;
	
	public ChessMatch() {
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
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
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		tabuleiro.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Torre(tabuleiro, Color.WHITE));
        placeNewPiece('c', 2, new Torre(tabuleiro, Color.WHITE));
        placeNewPiece('d', 2, new Torre(tabuleiro, Color.WHITE));
        placeNewPiece('e', 2, new Torre(tabuleiro, Color.WHITE));
        placeNewPiece('e', 1, new Torre(tabuleiro, Color.WHITE));
        placeNewPiece('d', 1, new Rei(tabuleiro, Color.WHITE));

        placeNewPiece('c', 7, new Torre(tabuleiro, Color.BLACK));
        placeNewPiece('c', 8, new Torre(tabuleiro, Color.BLACK));
        placeNewPiece('d', 7, new Torre(tabuleiro, Color.BLACK));
        placeNewPiece('e', 7, new Torre(tabuleiro, Color.BLACK));
        placeNewPiece('e', 8, new Torre(tabuleiro, Color.BLACK));
        placeNewPiece('d', 8, new Rei(tabuleiro, Color.BLACK));
	}
		
}
