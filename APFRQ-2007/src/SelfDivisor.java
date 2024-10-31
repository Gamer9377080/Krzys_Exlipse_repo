
public class SelfDivisor {
	public boolean isSelfDivisor(int number) {
		  int num = number;
		  while (num>0){
		    if(num%10==0)
		      return false;
		    if(number%(num%10)!=0)
		      return false;
		   num = num/10;
		  }
		  return true;
		}
	public int[] firstNumSelfDivisors(int start, int num){
		int[] list = new int[num];
		int listPostion = 0;
		for(int i = start; listPostion<num; i++)
			if(isSelfDivisor(i) ==true) {
				list[listPostion]=i;
				listPostion++;
			}
		
		
		return list;
	}
}
