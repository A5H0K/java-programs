
public class GreatestNumber {
	
	public static void main(String... strings){
		System.out.println("----Finding the greatest number in an array----");
		int[] array = {1,3,21000};
		
		int arraySize = array.length;
		int greatest = array[0];
		for(int i=1;i<arraySize;i++){
			if(array[i]>greatest){
				greatest = array[i];
			}
		}
		
	System.out.println("The Greatest Number is :: "+greatest);
	}

}
