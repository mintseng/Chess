import java.awt.image.BufferedImage;


public abstract class Piece
{
	protected BufferedImage image;

	public Piece(BufferedImage image)
	{
		this.image = image;
	}
	abstract boolean canMove();
	public final BufferedImage getImage()
	{
		return image;
	}
	
	
	
}
