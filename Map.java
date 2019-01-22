package swingSweeper;

import in_out.Out;

public class Map {
	static int[][] map;

	public static  int[][] generateMap(double mineRate, int mapWidth, int mapHeight) {
		boolean[][] mines = new boolean[mapWidth + 2][mapHeight + 2];
		for (int a = 0; a < mapWidth; a++)
			for (int b = 0; b < mapHeight; b++)
				mines[a][b] = (Math.random() < mineRate / 100);

		int[][] adj = new int[mapWidth][mapHeight];
		for (int a = 0; a < mapWidth; a++) {
			for (int b = 0; b < mapHeight; b++) {
				for (int aa = a - 1; aa <= a + 1; aa++) {
					for (int bb = b - 1; bb <= b + 1; bb++) {
						if (aa < 0 || bb < 0) {
						} else {
							if (mines[aa][bb]) {
								adj[a][b]++;
								adj[aa][bb] = 9;
							}}}}}}
		for (int a = 0; a < mapWidth; a++) {
			for (int b = 0; b < mapHeight; b++) {
				Out.print(adj[a][b]);
			}
			Out.println();
		}
		map = adj;
		return adj;
	}}
