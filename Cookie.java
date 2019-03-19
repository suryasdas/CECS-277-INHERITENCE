public class Cookie extends DessertItem{

	private float cookies;
	private final double cost = 399;
	
	public Cookie(float cookies1) {
		cookies = cookies1;
	}
	
	public float getCookies() {
		return cookies ;
	}
	
	@Override
	public double getCost() {
		return (cost * getCookies()) / 12;
	}
	
}
