public class WordCheckerTester {
	public static void main(String[] args) {
		String[] Exp1 = {"an", "band", "band","band", "abandon"};
		WordChecker exp1 = new WordChecker(Exp1);
		System.out.print(exp1.isWordChain());
		
		String[] Exp2 = {"catch", "bobcat", "catchacat", "cat", "at"};
		WordChecker exp2 = new WordChecker(Exp2);
		System.out.print(exp2.createList("cat"));
		
	}
}
