public class Chortle2 {
	public static int[] rowsums(int[][] data) {
		int sum=0;
	    int[] summ = new int[data.length];
	    for ( int row=0; row < data.length; row++){
	      sum=0;
	      for ( int col=0; col < data[row].length; col++) {
	    	 sum += data[row][col];
	      }
	      summ[row] = sum;
	      }
	    return summ;
	    }
		
	public static void main (String[] args ) 
	  {
	    int[][] data = { {3, 2, 5},{1, 4, 4, 8, 13},{9, 1, 0, 2},{0, 2, 6, 3, -1, -8} };
	    int[] summ = rowsums(data);
	    System.out.print(summ);
	   }
}
