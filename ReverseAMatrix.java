public class ReverseAMatrix {
	//This can be easily done by using reverse method of Collection
	public static void main(String... strings) {
		System.out.println("----Reversing an array----");
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
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

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
