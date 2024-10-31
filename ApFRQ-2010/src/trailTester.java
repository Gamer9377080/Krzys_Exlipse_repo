
public class trailTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] everest= {100,150,105,120,90,80,50,75,75,70,80,90,100};
		Trail basecamp = new Trail(everest);
		System.out.print(basecamp.isLevelTrailSegment(7, 10));
	}

}
