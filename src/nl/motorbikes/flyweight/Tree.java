package nl.designpatterns.flyweight;

public class Tree {
	
	//id is x and y.
	public int x;
	public int y;
	
	public int age;
	
	// no getters/setters this time...
	
	public Tree(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tree(int x, int y, int age) {
		this(x,y);
		this.age = age;
	}
	
	public void show() {
		System.out.println("<tree>");
		System.out.println("Mijn x is:"+x);
		System.out.println("Mijn y is:"+y);
		System.out.println("Mijn age is:"+age);
		System.out.println("</tree>");
	}
	
	

}
