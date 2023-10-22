
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5 ,6};
		
		merge(nums1, 3, nums2, 3);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Complete nums1 containing combined elements
        //Run a sorting algorithm (insertion sort) on nums1
        //Store inside nums1
    	
    	int[] arr1 = new int[m+n];
    	int counter = m;
    	
    	//Adds elements from first array
    	for (int i = 0; i < m; i++) {
			arr1[i] = nums1[i];
		}
    	//Adds elements from second array
    	for (int i = 0; i < n; i++) {
			arr1[counter] = nums2[i];
			counter++;
		}
    	
    	//SORTING ALGORITHM
    	
    	for(int i = 1; i < arr1.length; i++) {
    		int temp = arr1[i];
    		int j = i-1; //value on the left
    		
    		while(j >= 0 && arr1[j] > temp) {
    			arr1[j+1] = arr1[j];
    			j--;
    		}
    		
    		arr1[j+1] = temp;
    	}
    	
    	for (int i = 0; i < arr1.length; i++) {
			nums1[i] = arr1[i];
		}
    	
    	for (int i : nums1) {
			System.out.println(i);
		}
    }
    
    

}
