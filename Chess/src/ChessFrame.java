import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


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
		System.out.println("created");
		JMenuBar menuBar;
		menuBar = new JMenuBar();
		JMenu menuOne = new JMenu("First Item");
		JMenuItem newGame = new JMenuItem("New Game");
		menuOne.add(newGame);
		menuBar.add(menuOne);
		game.setJMenuBar(menuBar);
		
		game.setSize(702, 702+44);
		game.setResizable(false);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChessPanel panel = new ChessPanel();
		game.add(panel);
	    game.setVisible(true);
		
		
		
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
