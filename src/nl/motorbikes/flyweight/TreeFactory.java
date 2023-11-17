package nl.motorbikes.flyweight;

public class TreeFactory {
	Tree d, c = null;
	public TreeFactory() {
		this.d = new DeciduousTree();
		this.c = new ConiferTree();
	}
	public Tree getTree(String type) throws Exception {
		if ("deciduous".equals(type)) {
			return this.d;
		} else if ("conifer".equals(type)) {
			return this.c;
		} else {
			throw new Exception("Invalid kind of tree");
		}
	}
}