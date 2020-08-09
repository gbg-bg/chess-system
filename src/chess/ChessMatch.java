package chess;

import chess.pieces.Rei;
import chess.pieces.Torre;
import tabuleiro.Position;
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
	
	private void initialSetup() {
		tabuleiro.placePiece(new Torre(tabuleiro, Color.WHITE), new Position(2, 1));
		tabuleiro.placePiece(new Rei(tabuleiro, Color.BLACK), new Position(0, 4));
		tabuleiro.placePiece(new Rei(tabuleiro, Color.WHITE), new Position(7, 4));
	}
		
}
