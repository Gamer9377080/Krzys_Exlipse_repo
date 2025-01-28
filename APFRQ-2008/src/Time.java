
public class Time {
	private int Hours;
	private int minutes;
	private int totalmin;
	public void convertingMin() {
		 totalmin=(Hours*60)+minutes;
		
	}
	public Time(int h, int m) {
		Hours = h;
		minutes = m;
	}
	public int minutesUntil(Time other) {
		return other.totalmin-this.totalmin;
			
	}
}
