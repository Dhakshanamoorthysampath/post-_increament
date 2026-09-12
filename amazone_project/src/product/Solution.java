
package product;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	} 
	
public static void main(String[] args) {
	
	Solution solution = new Solution();
	solution.twoSum(new int[] {2,7,11,15}, 9);
	
	int[] arr=solution.twoSum(new int[] {2,7,11,15}, 9);
	System.out.println(arr[0]+arr[1]);
	System.out.println(Arrays.toString(arr));
	int value =0;  
	for(int i=0;i<arr.length;i++) {
		value+=arr[i];
		
	}
	System.out.println(value);
}
}
