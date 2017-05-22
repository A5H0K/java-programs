
public class BubbleSort {
	// Time Complexity for Bubble sort - worst and average case time complexity
	// - O(n*n)
	// It works by repeatedly swapping the adjacent elements if they are in
	// wrong order
	public static void main(String[] args) {
		System.out.println("----Bubble Sort----");
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = { 2, 3, 1, 9, 5, 7, 8 };
		bubbleSort.printArray(array);
		System.out.println("-----After sorting the Array----");
		bubbleSort.bubbleSort(array);
	}

	private void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				printArray(arr);
			}
		}
	}

	private void printArray(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
