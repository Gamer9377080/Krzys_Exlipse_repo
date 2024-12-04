
public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	private int total;
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}
	private int hopDistance() {
		total = 0;
		int hop = ((int)Math.random()*100);
		while(maxHops>0) {
			
			maxHops = maxHops-1;
		}
		
	}
	public boolean simulate() {
		if(hopDistance() >= goalDistance) {
			return true;
			}else {
				return false;
			}
	}
}
