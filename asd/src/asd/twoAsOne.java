package asd;

public class twoAsOne {
	public static boolean twoasOne(int a, int b, int c) {
		  if((a+b==c)||(b+a==c)||(a-b==c)||(b-a==c)){
		    return true;
		  }else{
		    return false;
		  }
		}
	public static void main(String[] args) {
		System.out.println(twoasOne(1,2,3));
		System.out.println(twoasOne(3,2,1));
		System.out.println(twoasOne(5,2,3));
		System.out.println(twoasOne(10,2,3));
	}
}
