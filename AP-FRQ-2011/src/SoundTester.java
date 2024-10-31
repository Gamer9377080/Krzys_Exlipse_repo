
public class SoundTester {
	public static void main(String[] args) {
		int[] sample1 = { 40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223 };
		Sound ampLim = new Sound(sample1);
		System.out.println(ampLim.limitAmp(4000));
	}
}
