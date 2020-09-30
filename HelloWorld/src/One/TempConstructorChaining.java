package One;

public class TempConstructorChaining {

	int x;
	TempConstructorChaining(){
		this.x = 5;
		System.out.println("Default x = "+x);
	}
	TempConstructorChaining(int temp){
		this();
		this.x = temp;
		System.out.println("one param x = "+x);
	}
	TempConstructorChaining(int x,int y){
		this(x+y);
		this.x = x*y;
		System.out.println("one param x = "+this.x);
	}
}
