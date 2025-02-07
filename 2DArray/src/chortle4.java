
public class chortle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 3, 2, 5, 0, 0, 0}, 
						 { 1, 4, 4, 8, 13,0}, 
						 { 9, 1, 0, 2, 0, 0}, 
						 { 0, 2, 6, 3, -1, -8} };
		int sumcol=0;
		
//  
		for (int col = 0; col < data[0].length; col++) {
			sumcol = 0;
			for ( int row=0;row < data.length; row++) {
				sumcol += data[row][col];
			}
			System.out.println("Col = "+ (col+1) +" Sum = " + sumcol);
			
		}

	}

}
