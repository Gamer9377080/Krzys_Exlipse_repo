import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;
	
	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		if(num == 0) {
			digitList.add(new Integer(0));
		}
		while(num>0){
			digitList.add(0, new Integer(num%10));
			num/=10;
		}
	}
	public ArrayList<Integer> getDigitList(){
		return digitList;
	}
	public boolean isStrictlyIncreasing() {
	 if() {
		 
	 }
	}
}
