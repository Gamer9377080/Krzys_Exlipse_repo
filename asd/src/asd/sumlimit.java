package asd;

public class sumlimit {
	public static int sumLimit(int a, int b) {
		  int sum = a+b;
		  String strA = String.valueOf(a);
		  String strSum = String.valueOf(sum);
		  if(strA.length()==strSum.length()) {
		    return sum;
		  }else{
		    return a;
		  }
		}
	
	
	public static void main(String[] args) {
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(98456, 3));
		System.out.println(sumLimit(2, 99));
		System.out.println(sumLimit(922567, 9345));
	}
}
