package chess;

import chess.pieces.Rei;
import chess.pieces.Torre;
import tabuleiro.Piece;
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
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece)capturedPiece;
	}
	
	private Piece makeMove(Position source, Position target) {
		Piece p = tabuleiro.removePiece(source);
		Piece capturedPiece = tabuleiro.removePiece(target);
		tabuleiro.placePiece(p, target);
		return capturedPiece;
	}
		
	private void validateSourcePosition(Position position) {
		if (!tabuleiro.thereIsAPiece(position)) {
			throw new ChessException("Não existe peça na posição de origem");
		}
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
