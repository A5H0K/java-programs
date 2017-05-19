
public class BinarySearchRecursion {
	public static void main(String[] args){
		System.out.println("----Binary Search - Recursive method----");
		int[] array = {1,2,3,4,5,6,7};
		BinarySearchRecursion binarySearch = new BinarySearchRecursion();
		System.out.println("key has been found at the index :: "+binarySearch.recursiveSearch(array, 0, array.length, 10));
		
	}
	
	private int recursiveSearch(int[] array,int start,int end,int key){
		
		
		if(start<end){
			int mid =(end + start) / 2;
			
			
			if(key<array[mid]){
				return recursiveSearch(array, start, mid, key);
			}else if(key>array[mid]){
				return recursiveSearch(array, mid+1, end, key);
			}else{
				System.out.println("INside the mid");
				return mid;
			}
		}
		return -(start+1)<0?-1:-(start+1);
	}
}
