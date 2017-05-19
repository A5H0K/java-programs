import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinarySearchDandC {

	public static void main(String... args) {
		System.out.println("----Starting the Binary Search----");
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		BinarySearchDandC binarySearch = new BinarySearchDandC();
		System.out.println("The search key at the index/position :: " + binarySearch.binarySearch(array, 7));
	}

	public int binarySearch(int[] inputArr, int key) {

		int start = 0;
		int end = inputArr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (key == inputArr[mid])
				return mid;

			if (key < inputArr[mid])
				end = mid - 1;

			if (key > inputArr[mid])
				start = mid + 1;
		}

		return -1;
	}
}
