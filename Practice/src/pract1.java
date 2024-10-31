
public class pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,6,8,10};
		int x = nums.length;
		for(int i=0; i<x; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i: nums) {
			System.out.print(i+ " ");
		}
	}

}
