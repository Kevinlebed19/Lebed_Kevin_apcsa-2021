//(c) A+ Computer Science
//www.apluscompsci.com
//Name -



public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort() {
		for (int i = 0; i < wordRay.length; i++) {
			int min = i;
			for (int j = i + 1; j < wordRay.length; j++) {
				if (wordRay[j].charAt(0) < wordRay[min].charAt(0)) {
					min = j;
				}
			}
			if (min != i) {
				String temp = wordRay[min];
				wordRay[min] = wordRay[i];
				wordRay[i] = temp;
			}
		}
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}