package mentor.interf;

public class TersterFlyable {

	public static void main(String[] args) {
		SpaceCraft sp = new SpaceCraft();
		Airplane ar = new Airplane();
		Helicopter he = new Helicopter();
		
		sp.fly_obj();
		ar.fly_obj();
		he.fly_obj();
	}
}
