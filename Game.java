package swingSweeper;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Game {

	public void main(String[] args) {
			
			JFrame frame = new JFrame("Graphics & Buttons");
			frame.addWindowListener
			(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
					});
			frame.setSize(1366,768);
			JPanel pane = (JPanel)frame.getContentPane();
			pane.setBackground(Color.GRAY);
			pane.add(new Picture(), BorderLayout.CENTER);
			pane.add(new JButton("Start"), BorderLayout.NORTH);
			pane.add(new JButton("Stop"), BorderLayout.SOUTH);
			frame.setVisible(true);
			
			
	}

}
class Picture extends JComponent
{
	private static final long serialVersionUID = 1L;

	public Picture()
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int[][] map = Map.map;
		for (int i=0; i<map.length;i++)
		{
		   for (int j=0;j<map[i].length;j++)
		   {
		          switch(map[i][j])
			{
			    case 1:
			        g.setColor(Color.LIGHT_GRAY);
			       break;
			    case 2:
			        g.setColor(Color.blue);
			       break;
			
			}
		          g.fillRect(j*20+5*j, i*20+5*i, 20, 20);
		   }
		
		}
	}
}
