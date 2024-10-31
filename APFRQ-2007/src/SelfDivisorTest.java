
public class SelfDivisorTest {
	public static void main(String[] args) {
		SelfDivisor test1 = new SelfDivisor();
		System.out.println(test1.isSelfDivisor(128));
		int[]data = test1.firstNumSelfDivisors(10, 7);
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+ " ");
	}
}
