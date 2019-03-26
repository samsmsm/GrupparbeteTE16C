	import javafx.scene.paint.Color;

	public abstract class Boat extends Vehicle {

	/**
	 * Konstruktor för att skapa en båt
	 * @param ep anger motorns kraft
	 * @param m  anger båtens modell
	 * @param c  anger färgen båten ska ha
	 */
		public Boat(Color c, int eP, String m) {
			super(c, eP, m);
		}
	}
