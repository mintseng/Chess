
public class Piece
{
	private int x;
	private int y;
	private String image;

	public Piece(int x, int y, String image)
	{
		this.x = x;
		this.y = y;
		this.image = image;
	}
	boolean canMove()
	{
		return false;
	}
	int getPositionX()
	{
		return x;
	}
	int getPositionY()
	{
		return y;
	}
	String getImage()
	{
		return image;
	}
	String toString()
	{
		return "";
	}
	
}
