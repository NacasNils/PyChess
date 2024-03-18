import chess

class Piece:
    
    chess.QUEEN  = 'Q'
    chess.KING   = 'K'
    chess.BISHOP = 'B'
    chess.KNIGHT = 'N'
    chess.ROOK   = 'R'
    chess.PAWN   = 'P'
    # chess.KING: chess.PieceType

class Board:    
    
    def __init__(self):
        self.board = chess.Board()
