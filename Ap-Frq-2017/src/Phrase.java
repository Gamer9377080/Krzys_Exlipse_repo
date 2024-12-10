
public class Phrase {
	private String currentPhrase;
	
	public Phrase(String p) {
		this.currentPhrase = p;
	}
	public int findNthOccittence(String str, int n) {
		int index = -1;
        int count = 0;

        for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
            if (currentPhrase.substring(i, i + str.length()).equals(str)) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
	}
	public void replasceNthOccerence(String str, int n, String repl) {
		int index = -1;
	    int count = 0;

	    for (int i = 0; i <= currentPhrase.length() - str.length(); i++) {
	        if (currentPhrase.substring(i, i + str.length()).equals(str)) {
	            count++;
	            if (count == n) {
	            }
	        }
	    }
	}
	public int findLastOccurrence(String str) {
		 int lastIndex = -1;
	        int occurrence = 1;
	        int currentIndex;

	        while ((currentIndex = findNthOccittence(str, occurrence)) != -1) {
	            lastIndex = currentIndex;
	            occurrence++;
	        }

	        return lastIndex;
	}
	public String toString(){
		return this.currentPhrase;
	}
	public void replaceNthOccurrence(String string, int i, String string2) {
		// TODO Auto-generated method stub
		
	}
}
