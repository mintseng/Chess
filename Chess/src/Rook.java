import java.awt.image.BufferedImage;


public class Rook extends Piece
{
	private final int BLACK = 1;
	private final int WHITE = 0;
	public Rook(BufferedImage image)
	{
		super(image);
	}
	

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}


}
