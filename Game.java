package swingSweeper;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import in_out.Out;

public class Game {

	public static void main(String[] args) {

		JFrame frame = new JFrame("MineSweeper");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setSize(1366, 768);
		JPanel pane = (JPanel) frame.getContentPane();
		pane.setBackground(Color.darkGray);
		pane.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent event) {
			}

			public void mouseEntered(MouseEvent event) {
			}

			public void mouseExited(MouseEvent event) {
			}

			public void mousePressed(MouseEvent event) {
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				int[] coords = Misc.nearest20(event.getX(), event.getY());
				Out.print(coords[0] + ", " + coords[1]);
				Out.println();
				switch (event.getButton()) {
				case MouseEvent.BUTTON1:
					Out.print("left");
					break;
				case MouseEvent.BUTTON3:
					Out.print("right");
					break;
				default:
					break;
				}
			}
		});
		pane.add(new Picture(), BorderLayout.CENTER);
		frame.setVisible(true);

	}

}

class Picture extends JComponent {
	private static final long serialVersionUID = 1L;

	public Picture() {
		repaint();
	}

	public void paint(Graphics g) {
		// default color
		g.setColor(Color.gray);
		int[][] map = Map.map;
	}
}
