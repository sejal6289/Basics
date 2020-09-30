package One;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi, this is sejal");
		
		//TempConstructorChaining t = new TempConstructorChaining(2,5);

		TempCopyConstructor tcc1 = new TempCopyConstructor(1,2);
		TempCopyConstructor tcc2 = tcc1;
		
		System.out.println(tcc2);
	}
}
	
