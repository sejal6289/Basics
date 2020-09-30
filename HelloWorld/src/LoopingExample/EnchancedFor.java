package LoopingExample;

public class EnchancedFor {
	
	String shahFamily[] = {"Bhaumik", "Sejal", "Ayaan"};
	int i = 3;
	
	public void loop_through() {
		
		for(String family:shahFamily) {
			System.out.println("Shah Family member : "+family);
		}
	}
	
	public void do_while() {
		
		do {
			System.out.println("Number of Shah Family member : "+i);
			i++;
		}while(i<4);
	}
	
	public static void main(String args[]) {
		EnchancedFor e = new EnchancedFor();
		e.loop_through();	
		e.do_while();
	}

}
