public class ArrayLinearRotation {

	public static void main(String... args){
		System.out.println("----Starting the Linear Array Rotation----");
		System.out.print("Array Before the Rotation -- ");
		
		int[] originalArray = {1,2,3,4,5,6,7};
		ArrayLinearRotation alr = new ArrayLinearRotation();
		alr.printArray(originalArray);
		System.out.println("");
		alr.rotateLeft(originalArray, 3, 7);
		System.out.print("Array after the Rotation -- ");
		alr.printArray(originalArray);
		// out put Array Should be in the form of {4,5,6,7,1,2,3}
		
	}
	
	private void rotateLeft(int[] arr,int d,int size){
		for(int i=0;i<d;i++){
			rotateOneByone(arr,size);
		}
	}
	
	private void rotateOneByone(int arr[],int size){
		int i;
		int temp;
		temp = arr[0];
		for(i=0;i<size-1;i++){
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		//printArray(arr);
	}
	
	
	private void printArray(int[] arr){
		int size = arr.length;
		String temp = "";
		for(int i=0;i<size;i++){
			
			temp = temp+arr[i]+" ";
		}
		System.out.println(temp);
	}
	
	
	
}
