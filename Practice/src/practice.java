
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {3,4,2,1,5};
			System.out.println(array[1]);
			String name = "Computer Science";
			System.out.println(name.substring(0,5));
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
			System.out.println();
		for(int i=0; i<name.length(); i++)
			System.out.print(name.substring(i, i+1) +" ");
		int sum = 0;
		for(int i=0; i<array.length; i++)
			sum+=array[i];
			System.out.print(sum);
	
	
	
	}

}
