
public class ArrayTwoDRotation {
	public static void main(String... strings) {
		System.out.println("----Transpose Matrix----");
		int[][] array = new int[2][2];
		array[0][0] = 1;
		array[0][1] = 2;
		array[1][0] = 3;
		array[1][1] = 4;
		ArrayTwoDRotation ar = new ArrayTwoDRotation();
		System.out.println(array.length);
		System.out.println("------------");
		ar.printArray(array);


		int transpose[][] = new int[2][2];

		for (int c = 0; c < 2; c++) {
			for (int d = 0; d < 2; d++)
				transpose[d][c] = array[c][d];
		}

		ar.printArray(transpose);

		for (int i = 0; i < 2; i++) {
			ar.reverseAMatrix(transpose[i]);
		}

		System.out.println("-----------------------");
		ar.printArray(transpose);
	}

	private void printArray(int[][] array) {

		for (int[] x : array) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

	private void reverseAMatrix(int[] array) {
		int arrayLength = array.length;
		int temp;
		int arrayMid = array.length / 2;
		for (int i = 0; i < arrayLength; i++) {

			if (i == arrayMid) {
				System.out.println(i);
				break;
			}
			temp = array[i];
			array[i] = array[arrayLength - 1 - i];
			array[arrayLength - 1 - i] = temp;
		}

	}
}
