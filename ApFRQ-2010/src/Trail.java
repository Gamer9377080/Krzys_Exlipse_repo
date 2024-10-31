
public class Trail {
	private int[] markers;
	
	public Trail(int[] m) {
		this.markers = m;		
	}
	public boolean isLevelTrailSegment(int start, int end) {
		int max =markers[start];
		int min =markers[start];
		for(int i=start; i<=end; i++){
			if(min>markers[i]);{
				min = markers[i];
			}
			if(max<markers[i]) {
				max=markers[i];
			}
		}
		if ((max-min)<=10) {
			return true;
		}else {
		return false;
		}
	}
	
	
	
	
	
	
	public boolean isDifficult() {
		return true;
	}
}
