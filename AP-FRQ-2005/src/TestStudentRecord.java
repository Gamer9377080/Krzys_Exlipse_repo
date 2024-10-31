
public class TestStudentRecord {
	public static void main(String[] args) {
		int[] sample1 = {50,50,20,80,53}; //50.8
		int[] sample2 = {20,50,50,53,80}; //61.0
		int[] sample3 = {20,50,50,80}; //65.0
		
		StudentRecord christian = new StudentRecord(sample1);
		StudentRecord Bob = new StudentRecord(sample2);
		StudentRecord Kevin = new StudentRecord(sample3);
		
		System.out.println(christian.finalAverage());
		System.out.println(Bob.finalAverage());
		System.out.println(Kevin.finalAverage());
	}
}
