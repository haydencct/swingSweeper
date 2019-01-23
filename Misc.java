package swingSweeper;

public class Misc {
	public static int[] nearest20(int x, int y) {
		int[] coords = new int[2];
		coords[0] = x - x%20;
		coords[1] = y - y%20;
		return coords;
	}
}
