
public class NumberCubeTester {
	public static void main(String[] args) {
		NumberCube cubey = new NumberCube(6);
		/*for(int i=0;i<100; i++) {
			System.out.println(cubey.toss());
		}*/
		NumberCubeSim sim1 = new NumberCubeSim(cubey);
		int[] data = sim1.getCudeTosses(30);
		System.out.println(sim1.getlongestrun(data));
	}
}
