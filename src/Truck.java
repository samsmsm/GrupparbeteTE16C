	import javafx.scene.paint.Color;

	public abstract class Truck extends Vehicle {

	private Flatbed flatbed;
	
	private Trailer trailer;

		/**
		 * Konstruktor för att skapa en truck
		 * @param m  anger truckens modell
		 * @param ep anger motorns kraft
		 * @param c  anger färgen trucken ska ha
		 */
		public Truck(Color c, int eP, String m, Flatbed f) {
			super(c, eP, m);
	
			if (f != null) {
				flatbed = f;
			}
		}

	@Override
	public void gas(double amount) {
		if (flatbed.flatbedAngle != 0)
			return;
		if (amount > 1 || amount < 0)
			return;
		incrementSpeed(amount);
	}

		/**
		 * Detta beskriver om lastbilen har ett släp
		 * @return Den returnerar en boolean
		 */
		public boolean hasTrailer() {
			return trailer != null;
		}

	/**
	 * Kollar om lastbilen är en flatbed
	 * @return Den returnerar en boolean
	 */
	public boolean isFlatbedTruck() {
		return flatbed != null;
	}

		/**
		 * Den kopplar på en trailer till lastbilen.
		 * @param Man skickar med en trailer
		 */
		public void connectTrailer(Trailer t) {
			trailer = t;
		}

	/**
	 * Den kopplar av en trailer ifrån lastbilen.
	 */
	public void disconnectTrailer() {
		trailer = null;
	}

		@Override
		public void move() {
			super.move();
			if (hasTrailer()) {
				trailer.updatePosition(getX(), getY());
			}
		}
	}
