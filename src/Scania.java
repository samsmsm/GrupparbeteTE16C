	import javafx.scene.paint.Color;

	public class Scania extends Truck {

	/**
	 * Det är en konstruktor för Scania lastbilar
	 * @param m  modell namn
	 * @param ep engine power
	 * @param c  lastbilens färg
	 */
	public Scania(Color c, Flatbed f) {
		super(c, 750, "Scania", f);
		stopEngine();
	}

		/**
		 * Returnernar hastighetsfaktorn för den individuella modellen.
		 */
		public double speedFactor() {
			return enginePower * 0.01;
		}
	}
