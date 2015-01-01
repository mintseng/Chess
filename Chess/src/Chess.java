import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Chess{
	//fields
	private BufferedImage blackRook;
	private BufferedImage blackKnight;
	private BufferedImage blackBishop;
	private BufferedImage blackQueen;
	private BufferedImage blackKing;
	private BufferedImage blackPawn;
	private BufferedImage whiteRook;
	private BufferedImage whiteKnight;
	private BufferedImage whiteBishop;
	private BufferedImage whiteQueen;
	private BufferedImage whiteKing;
	private BufferedImage whitePawn;
	private Piece[][] board;
	public Chess()
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
	//methods
	public void reset()//set up the board
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				//board[i][j] = new EmptyPiece();
				board[i][j] = null;
			}
		}
	
	//set up pieces.
	//black side
	
	board[1][1] = new Rook(blackRook);
	board[2][1] = new Knight(blackKnight);
	
	//white side
	
	// 8 (1,1), (2,1), (3,1), (4,1), (5,1), (6,1), (7,1), (8,1) 
	// 7 (1,2), (2,2), (3,2), (4,2), (5,2), (6,2), (7,2), (8,2)
	// 6 (1,3), (2,3), (3,3), (4,3), (5,3), (6,3), (7,3), (8,3)
	// 5 (1,4), (2,4), (3,4), (4,4), (5,4), (6,4), (7,4), (8,4)
	// 4 (1,5), (2,5), (3,5), (4,5), (5,5), (6,5), (7,5), (8,5)
	// 3 (1,6), (2,6), (3,6), (4,6), (5,6), (6,6), (7,6), (8,6)
	// 2 (1,7), (2,7), (3,7), (4,7), (5,7), (6,7), (7,7), (8,7)
	// 1 (1,8), (2,8), (3,8), (4,8), (5,8), (6,8), (7,8), (8,8)
	//     A      B      C      D      E      F      G      H 
	}
}
