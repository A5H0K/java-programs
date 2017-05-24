
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("----Insertion Sort----");
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort insertionSort = new InsertionSort();
		int[] array = {11,7,1,5,6,4,9,8};
		insertionSort.printArray(array);
		insertionSort.insertionSort(array);
	}

	private void insertionSort(int[] arr) {
		int n = arr.length;
        for (int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
  
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("-----After sorting-----");
        printArray(arr);
        
        
	}

	private void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
