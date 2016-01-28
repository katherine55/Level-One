public class TeaMaker {

	public static void main(String[] args) {
		TeaBag t = new TeaBag(TeaBag.GREEN);
		System.out.println("Oh, so you would like " + t.getFlavor() + "?");
		System.out.println("No? Too bad\nYes? Very good");
		Kettle k = new Kettle();
		//k.boil();
		Cup c = new Cup();
		c.makeTea(t, k.getWater());
	}

}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.\nPlease burn yourself.");
		else
			System.out.println(
					"Can't make tea with cold water! \nHaha oops forgot to boil the water!\nOh well then good bye!");
	}

}
