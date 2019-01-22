package swingSweeper;

import java.awt.event.*;
import javax.swing.*;

import in_out.Out;

import java.awt.*;

public class Game {

	public static void main(String[] args) {
			
			JFrame frame = new JFrame("MineSweeper");
			frame.addWindowListener
			(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
					});
			frame.setSize(Map.map.length*20 + (Map.map.length*5), Map.map.length*20 + (Map.map.length*5));
			JPanel pane = (JPanel)frame.getContentPane();
			pane.setBackground(Color.darkGray);
			pane.add(new Picture(), BorderLayout.CENTER);
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
		// default color
		g.setColor(Color.gray);
		int[][] map = Map.map;
		for (int i=0; i<map.length;i++)
		{
		   for (int j=0;j<map[i].length;j++)
		   {
			   /*
		          switch(map[i][j])
			{
			    case 0:
			        g.setColor(Color.lightGray);
			       break;
			    case 1:
			        g.setColor(Color.cyan);
			       break;
			    case 2:
			    	g.setColor(Color.green);
			    	break;
			    case 3:
			    	g.setColor(Color.red);
			    	break;
			    case 4:
			    	g.setColor(Color.blue);
			    	break;
			    case 5:
			    	g.setColor(Color.orange);
			    	break;
			    case 6:
			    	g.setColor(Color.magenta);
			    	break;
			    case 7:
			    	g.setColor(Color.black);
			    	break;
			    case 8:
			    	g.setColor(Color.gray);
			    	break;
			    case 9:
			    	g.setColor(Color.black);
			    	break;
			}
			*/
		          g.fillRect(j*20+5*j, i*20+5*i, 20, 20);
		   }
		
		}
	}
	public void actionPerformed(ActionEvent e) {
			Out.print(getX() + ", " + getY());
		}
}
