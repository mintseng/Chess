import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class ChessPanel extends JPanel {
	int width = 704;
	int height = 704+44;
	int gridSpace;
	//methods
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
		gridSpace = width/8;
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.BLACK);
		g2.fillRect(0, 0, width, height);
		g2.setPaint(Color.WHITE);
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if ((i+j)%2==0)
				{
					g2.fillRect(i*gridSpace, j*gridSpace, gridSpace, gridSpace);
				}
			}
		}
		repaint();
	}
}
