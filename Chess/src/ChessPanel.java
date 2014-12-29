import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ChessPanel extends JPanel  implements MouseListener{
	int width = 702;
	int height = 702+44;
	int gridSpace;
	BufferedImage blackRook = null;
	public ChessPanel()
	{
		super();
		addMouseListener(this);
	}
	
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
			System.out.println("Image has been caught");
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
		//this image is at 3, 3
		//g.drawImage(blackRook, gridSpace*3-gridSpace/2, gridSpace*3-gridSpace/2, gridSpace, gridSpace, null);
		//this image is at 2, 3
		g.drawImage(blackRook, gridSpace*2-gridSpace/2, gridSpace*3-gridSpace/2, gridSpace, gridSpace, null);
		//this image is at 1, 5
		g.drawImage(blackRook, gridSpace*1-gridSpace/2, gridSpace*5-gridSpace/2, gridSpace, gridSpace, null);
		//testing numbers and letters:
		g.setColor(Color.BLACK);
		
		g.drawString("A", gridSpace*1-gridSpace/4,  gridSpace*9-gridSpace/2+20);
		g.drawString("B", gridSpace*2-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("C", gridSpace*3-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("D", gridSpace*4-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("E", gridSpace*5-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("F", gridSpace*6-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("G", gridSpace*7-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("H", gridSpace*8-gridSpace/4, gridSpace*9-gridSpace/2+20);
		g.drawString("8", gridSpace*0+gridSpace/2-30, gridSpace*1-gridSpace/2+40);
		g.drawString("7", gridSpace*0+gridSpace/2-30, gridSpace*2-gridSpace/2+40);
		g.drawString("6", gridSpace*0+gridSpace/2-30, gridSpace*3-gridSpace/2+40);
		g.drawString("5", gridSpace*0+gridSpace/2-30, gridSpace*4-gridSpace/2+40);
		g.drawString("4", gridSpace*0+gridSpace/2-30, gridSpace*5-gridSpace/2+40);
		g.drawString("3", gridSpace*0+gridSpace/2-30, gridSpace*6-gridSpace/2+40);
		g.drawString("2", gridSpace*0+gridSpace/2-30, gridSpace*7-gridSpace/2+40);
		g.drawString("1", gridSpace*0+gridSpace/2-30, gridSpace*8-gridSpace/2+40);
		g.drawString("8", gridSpace*8+gridSpace/2+15, gridSpace*1-gridSpace/2+40);
		g.drawString("7", gridSpace*8+gridSpace/2+15, gridSpace*2-gridSpace/2+40);
		g.drawString("6", gridSpace*8+gridSpace/2+15, gridSpace*3-gridSpace/2+40);
		g.drawString("5", gridSpace*8+gridSpace/2+15, gridSpace*4-gridSpace/2+40);
		g.drawString("4", gridSpace*8+gridSpace/2+15, gridSpace*5-gridSpace/2+40);
		g.drawString("3", gridSpace*8+gridSpace/2+15, gridSpace*6-gridSpace/2+40);
		g.drawString("2", gridSpace*8+gridSpace/2+15, gridSpace*7-gridSpace/2+40);
		g.drawString("1", gridSpace*8+gridSpace/2+15, gridSpace*8-gridSpace/2+40);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("x is " + e.getX());
		System.out.println("y is " + e.getY());
		if (x < gridSpace/2)
		{
			System.out.println("0");
		}
		else if (x < gridSpace/2 + gridSpace)
		{
			System.out.println("1");
		}
		else if (x < gridSpace/2 + gridSpace*2)
		{
			System.out.println("2");
		}
		else if (x < gridSpace/2 + gridSpace*3)
		{
			System.out.println("3");
		}
		else if (x < gridSpace/2 + gridSpace*4)
		{
			System.out.println("4");
		}
		else if (x < gridSpace/2 + gridSpace*5)
		{
			System.out.println("5");
		}
		else if (x < gridSpace/2 + gridSpace*6)
		{
			System.out.println("6");
		}
		else if (x < gridSpace/2 + gridSpace*7)
		{
			System.out.println("7");
		}
		else if (x < gridSpace/2 + gridSpace*8)
		{
			System.out.println("8");
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
