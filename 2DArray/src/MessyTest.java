public class MessyTest {
public static void main(String[] args) {
	int[][] a = new int[3][3];
	for(int row = 0;row<a.length;row++) {
		for(int col=0;col<a[row].length;col++) {
			System.out.print(a[row][col]+" ");
		}
		System.out.println();
	}
}
}
