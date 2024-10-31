
public class Sound {
	private int[] samples;
	public Sound(int[] s) {
		this.samples= s;
	}
	public int limitAmp(int limit) {
		int changed = 0;
		for(int i = 0; i<samples.length; i++) {
			if(samples[i] > limit) {
				samples[i] = limit;
				changed++;
			}else if (samples[i]<(limit*-1)) {
				samples[i] = (limit*-1);
				changed++;
			}
		}
		return changed;
	}
	public void trimSilenceFromBeginning() {
		int i = 0;
		int[] sample2 = { 0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
		this.samples = sample2;
		 while (this.samples[i] == 0) {
		 i++;
		 }
		 int[] newSamples = new int[this.samples.length - i];
		 for (int j = 0; j < newSamples.length; j++) {
			 newSamples[j] = this.samples[j+i];
			 System.out.println(newSamples);
		 }
		 this.samples = newSamples;
		 
	}
	
}
