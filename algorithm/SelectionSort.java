
public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("----Selection Sort----");
		
		int[] unsortedArray= {5,6,4,10,8,3,9,2};
		
		
		
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.printArray(unsortedArray);
		System.out.println();
		System.out.println("----Array will be sorting----");
		selectionSort.sort(unsortedArray);
	}
	
	private void sort(int[] arr){
		
		int size = arr.length;
		
		for(int i=0;i<size-1;i++){
			int minINdex = i;
			for(int j=i+1;j<size;j++){
				if(arr[j]<arr[minINdex]){
					minINdex = j;
				}
				int temp = arr[minINdex];
				arr[minINdex] = arr[i];
				arr[i] = temp;
			}
			
			System.out.println();
			printArray(arr);
			
		}
		
	}
	
	private void printArray(int[] array){
		for(int x:array){
			System.out.print(x+" ");
		}
	}
}
