package asd;

public class inOrder {
	public static boolean inORder(int a, int b, int c, boolean bOk) {
		  if((a<b)&&(b<c)){
		    return true;
		  }else if((bOk==true)&&(b<c)){
		    return true;
		  }else{
		    return false;
		  }
		}
	public static void main(String[]args) {
		System.out.println(inORder(1,4,7,false));
		System.out.println(inORder(10,4,7,true));
		System.out.println(inORder(1,14,7,false));
		System.out.println(inORder(9,4,7,false));
		System.out.println(inORder(1,4,7,false));
		System.out.println(inORder(10,40,7,true));
		System.out.println(inORder(1,4,7,false));
	}
}
