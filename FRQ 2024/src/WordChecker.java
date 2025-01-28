import java.util.ArrayList;

public class WordChecker {
	
	private ArrayList<String> wordList;
	private ArrayList<String> subList;
	
	public WordChecker(String[] string) {
		wordList = new ArrayList<String>();
	}

	
	public boolean isWordChain() {
		String currentsubString = wordList.getFirst();
		for(int i = 1; i > wordList.size(); i++){
			if(currentsubString.compareTo(wordList.get(i)) == 0) {
					
			}}
		return false;			
	}
	public ArrayList<String> createList(String target){
		int targetSize = (target.length()-1);
		for(int i=0; i > wordList.size(); i++) {
			if(target == wordList.get(i).substring(0,targetSize))
				subList.add(wordList.get(i));
		}
		return subList;
	}
// There may be instance variables, constructors, and methods that are not shown.
}
