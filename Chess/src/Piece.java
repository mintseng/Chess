
public class Piece extends BufferedImage
{
	private int x;
	private int y;
	private String image;

	public Piece(int x, int y, String image)
	{
		self.x = x;
		self.y = y;
		self.image = image;
	}
	boolean canMove()
	{
		return False;
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
