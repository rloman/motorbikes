package nl.motorbikes.flyweight;

public class Application {

	static int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
	static int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};
	public static void main(String[] args) {

		TreeFactory treeFactory = new TreeFactory(); // creates the two flyweights
		Tree d, c;
		try {
			d = treeFactory.getTree("deciduous");
			for (int[] location : deciduousLocations) {
				d.display(location[0],  location[1]);
			}
			c = treeFactory.getTree("conifer");
			for (int[] location : coniferLocations) {
				c.display(location[0],  location[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		shoot(1,1);
		shoot(1,1);
	}

	public static void shoot(int x, int y) {
		int c = 0;
		for (int[] locatie : deciduousLocations) {
			if (locatie[0] == x && locatie[1] == y) {
				locatie = null;
				System.out.println("You shot the tree!");
			}
		}
	}
}