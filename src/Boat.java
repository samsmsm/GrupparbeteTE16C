	import javafx.scene.paint.Color;

	public abstract class Boat extends Vehicle {

	/**
	 * Konstruktor f�r att skapa en b�t
	 * @param ep anger motorns kraft
	 * @param m  anger b�tens modell
	 * @param c  anger f�rgen b�ten ska ha
	 */
		public Boat(Color c, int eP, String m) {
			super(c, eP, m);
		}
	}
