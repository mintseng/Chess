import java.awt.image.BufferedImage;


public class Bishop extends Piece
{
	private final int BLACK = 1;
	private final int WHITE = 0;
	public Bishop(BufferedImage image)
	{
		super(image);
	}
	

	@Override
	boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

}
