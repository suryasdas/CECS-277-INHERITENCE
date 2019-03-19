public class Candy extends DessertItem{
	
	private float weight;
	private final double cost = 0.89;
	
	public Candy(float weight1) {
		weight = weight1;
	}
	
	public float getWeight() {
		return weight * 16;
	}
	
	@Override
	public double getCost() {
		
		return (cost * getWeight()) / 16;
	}
	
}