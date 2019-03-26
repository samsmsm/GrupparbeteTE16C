	import javafx.scene.paint.Color;

	public class AudiA8 extends Car {

	/**
	 * Konstruktorn specifik f�r bilmodellen AudiA8 
	 **/
	public AudiA8(Color c) {
		super(c, 105, "AudiA8");
		stopEngine();
	}

	
	/**
	 *Returnerar hastighetsfaktorn f�r den individuella bilmodellen
	 */
		public double speedFactor() {
			return enginePower * 0.01;
		}
	}
