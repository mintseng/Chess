import javax.swing.JFrame;


public class ChessFrame extends JFrame {
	//fields
	
	
	//constructors
	public ChessFrame(String name)
	{
		super(name);
	}
	
	//methods
	public static void main(String[] args)
	{
		System.out.println("starting the main");
		
		ChessFrame game = new ChessFrame("Chess");//pass in players or ai
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
		System.out.println("created");
	}
	boolean canMove()
	{
		return true;
	}
	int getPositionX()
	{
		return 1;
	}
	int getPositionY()
	{
		return 1;
	}
	
}
