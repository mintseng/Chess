
public class Board {
	//fields
	Piece[][] board;
	
	//constructor
	
	//methods
	public String toString()
	{
		for (int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				System.out.print(board[i][j].toString() + " ");
			}
			System.out.println("");
		}
		return "";
	}
}
