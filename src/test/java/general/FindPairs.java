package general;

public class FindPairs {
	/**
	 * Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)
	 * @param arr
	 * @param target
	 * @return For this time assume there is only one pair can fit the target sum
	 */
		 public int[] getIndex(int[] arr, int target){
			 int tempSum=0;
			 int[] indexs = new int[2];
			 
			 for(int i = 0; i < arr.length-1; i++){
				 for( int j = i + 1; j < arr.length; j++){
					 tempSum = arr[i] + arr[j];
					 if(tempSum == target){
						 indexs[0] = i ;
						 indexs[1] = j ;
						 System.out.println("Value of index "+ i+ " is "+arr[i]);
						 System.out.println("Value of index "+ j+ " is "+arr[j]);
						 break;
					 }
				 }
			 }
			 return indexs;
		 }
}
