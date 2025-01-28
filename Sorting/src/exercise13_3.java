
public class exercise13_3 {
	public static void selectionSort(Integer[] item, int size) {
		for (int k = size-1; k > 0; k--)
			swapLargeToBack(item, k, 0);
	} // =======================

	private static void swapLargeToBack(Integer[] item, int start, int end) {
		int indexLargest = start;
		for (int k = start - 1; k >= end; k--) {
			if (item[k].compareTo(item[indexLargest]) > 0)
				indexLargest = k;
		}
		Integer saved = item[start];
		item[start] = item[indexLargest];
		item[indexLargest] = saved;
		
		for(Integer i: item) {
			System.out.print(i+" ");
		}
		System.out.println();
	} // =======================
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] num = {7, 12, 5, 8, 3, 6};
		selectionSort(num, num.length);
		for(Integer i:num) {
			System.out.print(i+" ");
		}
	}

}
