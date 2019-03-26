	import javafx.scene.paint.Color;

	public class Audirs6 extends Car {

	/**
	 * Konstruktorn specifik för bilmodellen Tesla Model S
	 */
	public Audirs6(Color c) {
		super(c, 150, "TeslaModelS");
		stopEngine();
	}

	/**
	 * Returnerar hastighetsfaktorn för den individuella bilmodellen
	 */
		public double speedFactor() {
			return enginePower * 0.01;
		}
	}
