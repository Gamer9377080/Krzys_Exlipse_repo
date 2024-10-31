
public class NumberCube {
	 private int sides;
	public NumberCube(int sides) {
		this.sides = sides;
		
	}
	public int toss() {
		return (int)(Math.random() * (sides)+1);
	}
}
