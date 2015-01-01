
public class Pawn extends Piece
{
	
	public Pawn(String image)
	{
		super(image);
	}

	@Override
	boolean canMove() {//pass in a grid here? 
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return image;
	}
}
