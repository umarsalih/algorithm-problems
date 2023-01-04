
public class solution {
	
	public int[] twoSum(int[] nums, int target) {
	boolean sumFound = false;
	int [] indices = new int [2];
	
	int j = 1;
	
	for (int i = 0; i < nums.length; i++) {
	
		j = i + 1;
		while(j < nums.length) {
			if (nums[i] + nums[j] == target) {
				//System.out.println(indices[i] + " + "  + indices[j]);
				indices[0] = i;
				indices[1] = j;
				break;
			}
			else {
				j++;
			}
		}
	
	}
	
	return indices; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
