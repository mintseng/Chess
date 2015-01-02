import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class PieceFactory //singleton
{
	public static enum PieceType
	{
		ROOK, KNIGHT, BISHOP, QUEEN, KING, PAWN;
	}
	private final static int BLACK = 1;
	private final static int WHITE = 0;
	private static BufferedImage blackRook;
	private static BufferedImage blackKnight;
	private static BufferedImage blackBishop;
	private static BufferedImage blackQueen;
	private static BufferedImage blackKing;
	private static BufferedImage blackPawn;
	private static BufferedImage whiteRook;
	private static BufferedImage whiteKnight;
	private static BufferedImage whiteBishop;
	private static BufferedImage whiteQueen;
	private static BufferedImage whiteKing;
	private static BufferedImage whitePawn;

	private static final PieceFactory INSTANCE = new PieceFactory();
	private PieceFactory()
	{
		try {
			blackRook = ImageIO.read(new File("blackRook.png"));
			blackKnight = ImageIO.read(new File("blackKnight.png"));
			blackBishop = ImageIO.read(new File("blackBishop.png"));
			blackQueen = ImageIO.read(new File("blackQueen.png"));
			blackKing = ImageIO.read(new File("blackKing.png"));
			blackPawn = ImageIO.read(new File("blackPawn.png"));
			whiteRook = ImageIO.read(new File("whiteRook.png"));
			whiteKnight = ImageIO.read(new File("whiteKnight.png"));
			whiteBishop = ImageIO.read(new File("whiteBishop.png"));
			whiteQueen = ImageIO.read(new File("whiteQueen.png"));
			whiteKing = ImageIO.read(new File("whiteKing.png"));
			whitePawn = ImageIO.read(new File("whitePawn.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static PieceFactory getFactory()
	{
		return INSTANCE;
	}
	public Piece buildPiece(PieceType type, int side) throws Exception
	{
		switch(side)
		{
		case BLACK:
			switch(type)
			{
			case ROOK:
				return new Rook(blackRook);
			case KNIGHT:
				return new Knight(blackKnight);
			case BISHOP:
				return new Bishop(blackBishop);
			case QUEEN:
				return new Queen(blackQueen);
			case KING:
				return new King(blackKing);
			case PAWN:
				return new Pawn(blackPawn);
			default:
				return null;
			}
		case WHITE:
			switch(type)
			{
			case ROOK:
				return new Rook(whiteRook);
			case KNIGHT:
				return new Knight(whiteKnight);
			case BISHOP:
				return new Bishop(whiteBishop);
			case QUEEN:
				return new Queen(whiteQueen);
			case KING:
				return new King(whiteKing);
			case PAWN:
				return new Pawn(whitePawn);
				
			default:
				return null;
			}
		default:
			break;
		}
		throw new Exception("piece input not valid");
	}
}
