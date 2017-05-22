
public class StringSort {
	public static void main(String[] args) {
		System.out.println("----String Sorting----");
		String word = "acbdfehilkonmp";
		System.out.println("The gives string is :: " + word);
		StringSort stringSort = new StringSort();
		char[] charArray = word.toCharArray();
		stringSort.sort(charArray);
		System.out.println("Sorted String :: "+String.valueOf(charArray));
	}

	private void sort(char[] arr) {

		int size = arr.length;

		for (int i = 0; i < size - 1; i++) {
			int minINdex = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[minINdex]) {
					minINdex = j;
				}
				char temp = arr[minINdex];
				arr[minINdex] = arr[i];
				arr[i] = temp;
			}

		}

	}
}
