import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ChessPanel extends JPanel {
	int width = 702;
	int height = 702+44;
	int gridSpace;
	BufferedImage blackRook = null;
	
	//methods
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
		try
		{
			blackRook = ImageIO.read(new File("chess_piece_black_rook.png"));
		}
		catch(IOException ex)
		{
			
		}
		gridSpace = width/9;
		Graphics2D g2 = (Graphics2D) g;
		Color originalBrown = new Color(139, 69, 19);
		g2.setPaint(originalBrown);
		g2.fillRect(0, 0, width, height);
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if ((i+j)%2==0)
				{
					//g2.setPaint(Color.YELLOW);
					g2.setPaint(originalBrown.brighter().brighter());
					g2.fillRect(i*gridSpace+gridSpace/2, j*gridSpace+gridSpace/2, gridSpace, gridSpace);
				}
				else 
				{
					g2.setPaint(Color.BLACK);
					g2.fillRect(i*gridSpace+gridSpace/2, j*gridSpace+gridSpace/2, gridSpace, gridSpace);
				}
			}
		}
		g.drawImage(blackRook, gridSpace*3-gridSpace/2, gridSpace*3-gridSpace/2, gridSpace, gridSpace, null);
		g.drawImage(blackRook, gridSpace*2-gridSpace/2, gridSpace*3-gridSpace/2, gridSpace, gridSpace, null);
		
	}
}
