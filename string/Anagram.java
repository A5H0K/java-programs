
public class Anagram {

	public static void main(String[] args) {
		System.out.println("----Anagram of a string----");
		String word = "JAVA";
		String anagramWord = "AJAV";

		Anagram anagram = new Anagram();

		boolean result = anagram.anagramCheck(word, anagramWord);

		System.out.println(result ? "The given words are anagram" : "The given words are not anagram");

	}

	private boolean anagramCheck(String word, String anagram) {

		char[] ch = word.toCharArray();
		StringBuffer sb = new StringBuffer(anagram);

		for (char c : ch) {
			int index = sb.indexOf(String.valueOf(c));
			if (index != -1) {
				sb.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sb.length() == 0;
	}

}
