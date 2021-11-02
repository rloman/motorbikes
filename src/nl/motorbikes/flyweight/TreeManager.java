package nl.motorbikes.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeManager {

	private static TreeManager instance = new TreeManager();

	private TreeManager() {
	}

	public int[][] xy = new int[50][50];

	public void addTree(Tree tree) {
		this.xy[tree.x][tree.y] = tree.age;

	}

	public Tree getTree(int x, int y) {
		Tree tree = new Tree(x, y, this.xy[x][y]);

		return tree;
	}

	public static TreeManager getInstance() {
		return instance;
	}

	// dit zou ik via het Iterator Pattern mooier kunnen maken maar nu focus ik
	// op het FlyWeight pattern. Dat
	// houdt het wat klassieker.
	public List<Tree> getTrees() {

		List<Tree> trees = new ArrayList<Tree>();
		for (int i = 0; i < xy.length; i++) {
			for (int j = 0; j < xy[i].length; j++) {
				if (this.xy[i][j] != 0) {
					trees.add(new Tree(i, j, this.xy[i][j]));
				}

			}
		}

		return trees;
	}
}
