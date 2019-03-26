	import javafx.scene.paint.Color;

	public abstract class Car extends Vehicle {

	/**
	 * Konstruktor för att skapa en bil
	 * @param m  anger bilens modell
	 * @param ep anger motorns kraft
	 * @param c  anger färgen bilen ska ha
	 */
		public Car(Color c, double eP, String m) {
			super(c, eP, m);
		}
	}