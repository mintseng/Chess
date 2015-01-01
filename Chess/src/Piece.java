
public abstract class Piece
{
	protected String image;

	public Piece(String image)
	{
		this.image = image;
	}
	abstract boolean canMove();
	public abstract String getImage();
	
	
	
}
