package One;

public class TempStatic {
	
	static int temp;
	
	static {
		temp = 10;
		System.out.println(temp);
	}
	
	{
		System.out.println("Initialize block");
	}
	
	TempStatic(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempStatic i = new TempStatic();
		TempStatic i2 = new TempStatic();

	}

}
