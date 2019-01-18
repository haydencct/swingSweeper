package swingSweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu {
	public void main(String[] args) {
		MineFrame frame = new MineFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class MineFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField mineRate, mapWidth, mapHeight;

	public MineFrame() {
		super("Minesweeper Setup");
		// organize content pane
		JPanel pane = (JPanel) getContentPane();
		pane.setLayout(new BorderLayout());
		// create fields for i/oput
		mineRate = new JTextField(10);
		mapWidth = new JTextField(10);
		mapHeight = new JTextField(10);
		// add labelled input fields to display
		JPanel inFieldPane = new JPanel();
		inFieldPane.setLayout(new GridLayout(3, 2));
		inFieldPane.add(new JLabel("Mine Rate (0-100)"));
		inFieldPane.add(mineRate);
		mineRate.addActionListener(this);
		inFieldPane.add(new JLabel("Map Width"));
		inFieldPane.add(mapWidth);
		mapWidth.addActionListener(this);
		inFieldPane.add(new JLabel("Map Height"));
		inFieldPane.add(mapHeight);
		mapHeight.addActionListener(this);
		pane.add(inFieldPane, BorderLayout.NORTH);
		// add submission button
		JPanel submitPane = new JPanel();
		submitPane.setLayout(new FlowLayout());
		JButton submitButton = new JButton("Play");
		submitButton.addActionListener(this);
		submitPane.add(submitButton);
		pane.add(submitPane, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// this line is pretty long, but it just turns all the user inputs from strings to integers in one line, then gives them to the method generateMap within the class Map.
		Map.generateMap(Double.parseDouble(mineRate.getText()), Integer.parseInt(mapWidth.getText()), Integer.parseInt(mapHeight.getText()));
			
		}
	}
