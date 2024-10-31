
public class NumberCubeSim {
	
	private NumberCube cube;
	public NumberCubeSim(NumberCube c) {
		cube = c;
	}
	public int[] getCudeTosses(int numTosses) {
		int[] tosses = new int[numTosses];
		for(int i=0; i<numTosses; i++) {
			tosses[i]=cube.toss();
	}
		return tosses;
	}
	public int getlongestrun(int[] values) {
		int maxIndex = -1;
		int maxLength = 1;
		int runindex=0, runlegth =1;
		for(int i=1; i<values.length;i++ ) {
			if(values[i]== values[runindex]) {
				runlegth++;
				if(runlegth>maxLength) {
					maxLength = runlegth;
					maxIndex = runindex;
				}
			}else {
				runindex =i;
				runlegth=i;
			}
		}
		return maxIndex;
		
	}
}
