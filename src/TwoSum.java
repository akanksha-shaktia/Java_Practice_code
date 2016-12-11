/* Problem Statement:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution.
   Example:
   Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class TwoSum {
	public static void main(String[] args) {
		int data[] = {3,2,4};
		System.out.println(twoSum(data, 6));
	}
	public static int[] twoSum(int[] nums, int target) {
        boolean found=false;
        int i = 0,j=0;
        for(; i<nums.length; i++){
            for(j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                	found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        int result[]= {i,j};
        return result;
    }

}
