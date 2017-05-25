
public class MergeSort {
	// it works in the principle of divide and conquer method
	public static void main(String[] args) {
		System.out.println("----Merge Sort----");
		int[] array = { 11, 5, 13, 8, 9, 27, 60, 1, 3 };
		MergeSort mergeSort = new MergeSort();
		mergeSort.printArray(array);
		System.out.println("Sorting the array...");
		mergeSort.sort(array, 0, array.length - 1);
		
		mergeSort.printArray(array);

	}

	private void sort(int[] arr, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			// Find the middle point
			int m = (startIndex + endIndex) / 2;

			// Sort first and second halves
			sort(arr, startIndex, m);
			sort(arr, m + 1, endIndex);
			
			merge(arr, startIndex, m, endIndex);
		}
	}

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private void printArray(int[] arr) {

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
