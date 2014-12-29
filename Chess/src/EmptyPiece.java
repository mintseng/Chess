
public class EmptyPiece implements Piece{
	public boolean canMove()
	{
		return true;
	}
	public int getPositionX()
	{
		return 0;
	}
	public int getPositionY()
	{
		return 0;
	}
	public String toString()
	{
		return "";
	}
}
