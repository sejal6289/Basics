package EnumExample;

class PlanetsInfo {
	
	final int i;
	
	PlanetsInfo(){
		this.i=10;
	}

	void info(EnumExample.Planets p) 
	{
		switch(p) 
		{
		case MERCURY:
			System.out.println("Mercury is the closest planet to sun");
			break;
		case VENUS:
			System.out.println("Venus is the hottest planet");
			break;
		case EARTH:
			System.out.println("Earth is the 3rd planet from sun");
			break;
		case JUPITER:
			break;
		case MARS:
			break;
		case NEPTUNE:
			break;
		case SATURN:
			break;
		case URANUS:
			break;
		default:
			break;
		}
		
	}
}


public class EnumExample {

	enum Planets {
		MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planets p;
		p = Planets.VENUS;
		
		PlanetsInfo pi = new PlanetsInfo();
		pi.info(p);
		
		Planets arr[] = Planets.values();
		for(Planets p1 : arr) {
			System.out.println(p1);
		}
		
		
	}

}
