
public abstract class Piece
{
	protected int x;
	protected int y;
	protected String image;

	public Piece(int x, int y, String image)
	{
		this.x = x;
		this.y = y;
		this.image = image;
	}
	abstract boolean canMove();
	public abstract String getImage();
	
	
	
}
