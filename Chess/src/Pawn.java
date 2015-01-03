import java.awt.image.BufferedImage;


public class Pawn extends Piece
{
	private final int BLACK = 1;
	private final int WHITE = 0;	
	public Pawn(BufferedImage image)
	{
		super(image);
	}

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}


	
}
