package AbstractClassExample;

public abstract class Shape {
	String color;
	final int temp=10;
	
	Shape(String color){
		System.out.println("Constructor called - Shape");
		this.color = color;
		this.print_color();
	}
	
	abstract public void name ();
	
	public void print_color() {
		System.out.println("Color of this shape is "+color);
	}
	
	final public void print_color1() {
		System.out.println("Color of this shape is "+color);
	}
}
