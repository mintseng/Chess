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
		Chess chess = new Chess();//the game engine
		ChessFrame game = new ChessFrame("Chess");//pass in players or ai
		JMenuBar menuBar;
		menuBar = new JMenuBar();
		JMenu menuOne = new JMenu("First Item");
		JMenuItem newGame = new JMenuItem("New Game");
		chess.reset();
		menuOne.add(newGame);
		menuBar.add(menuOne);
		game.setJMenuBar(menuBar);
		
		game.setSize(702, 702+44);
		game.setResizable(false);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChessPanel panel = new ChessPanel();
		panel.setBoard(chess.getBoard());
		game.add(panel);
	    game.setVisible(true);

	    // 1/3/15 3:02 it is late af

	    // example for iterating a 2d array for-each
	    // int x[][] = new int[2][2];
	    // x[0][0] = 1;
	    // x[0][1] = 2;
	    // x[1][0] = 3;
	    // x[1][1] = 4;

	    // for (int[] list: x)
	    // 	for (int num: list)
	    // 		System.out.println(num);
		
		
		
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
