
public class Trail {
	private int[] markers;
	
	public Trail(int[] m) {
		this.markers = m;		
	}
	public boolean isLevelTrailSegment(int start, int end) {
		int change = Math.abs(start - end);
		if(change >= 10) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	public boolean isDifficult() {
		return true;
	}
}
