import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class ChessPanel extends JPanel {
	int width = 702;
	int height = 702+44;
	int gridSpace;
	//methods
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
		gridSpace = width/9;
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(new Color(139, 69, 19));
		g2.fillRect(0, 0, width, height);
		g2.setPaint(Color.WHITE);
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if ((i+j)%2==0)
				{
					g2.setPaint(Color.WHITE);
					g2.fillRect(i*gridSpace+gridSpace/2, j*gridSpace+gridSpace/2, gridSpace, gridSpace);
				}
				else 
				{
					g2.setPaint(Color.BLACK);
					g2.fillRect(i*gridSpace+gridSpace/2, j*gridSpace+gridSpace/2, gridSpace, gridSpace);
				}
			}
		}
		repaint();
	}
}
