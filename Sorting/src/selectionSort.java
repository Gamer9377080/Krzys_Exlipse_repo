
public class selectionSort {
	/**
	 * Precondition: size <= item.length; item[0]...item[size-1] are non-null values
	 * all Comparable to each other. Postcondition: The array contains the values it
	 * initially had but with item[0]...item[size-1] in ascending order.
	 */
	public static void selectionSort(Integer[] item, int size) {
		for (int k = 0; k < size - 1; k++)
			swapMinToFront(item, k, size - 1);
	} // =======================

	private static void swapMinToFront(Integer[] item, int start, int end) {
		int indexSmallest = start;
		for (int k = start + 1; k <= end; k++) {
			if (item[k].compareTo(item[indexSmallest]) < 0)
				indexSmallest = k;
		}
		Integer saved = item[start];
		item[start] = item[indexSmallest];
		item[indexSmallest] = saved;
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
