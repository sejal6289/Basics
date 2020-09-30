package One;

public class TempCopyConstructor {
	private int x,y;
	
	public TempCopyConstructor(int a,int b){
		x=a;
		y=b;
	}
	
	//copy Constructor
	TempCopyConstructor(TempCopyConstructor t){
		x = t.x;
		y = t.y;
	}
	
	public String toString() {
		return "x = "+x+" y = "+y;
		
	}

}
