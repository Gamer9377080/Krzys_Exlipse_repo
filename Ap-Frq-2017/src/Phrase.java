public class Phrase {
	private String currentPhrase;

	public Phrase(String p) {
		this.currentPhrase = p;
	}

	public int findNthOccurrence(String str, int n) {
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

	public void replaceNthOccurrence(String str, int n, String repl) {
		int index = findNthOccurrence(str, n);
		if (index != -1) {
			currentPhrase = currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
		}
	}

	public int findLastOccurrence(String str) {
		int lastIndex = -1;
		int occurrence = 1;
		int currentIndex;

		while ((currentIndex = findNthOccurrence(str, occurrence)) != -1) {
			lastIndex = currentIndex;
			occurrence++;
		}

		return lastIndex;
	}

	public String toString() {
		return this.currentPhrase;
	}
}