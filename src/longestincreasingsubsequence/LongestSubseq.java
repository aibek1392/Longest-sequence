package longestincreasingsubsequence;

import java.util.Arrays;

public class LongestSubseq {

	public int longestSeq(int[] nums) {
		if(nums.length  <= 1) 
			return nums.length;
		int[] maxLength = new int[nums.length];
		int max = -1;
		Arrays.fill(maxLength, 1);
		for(int i = 1; i < nums.length; i++) {
			for(int j = 0; j<i; j++) {
				if(nums[j]< nums[i]) {
					maxLength[i] = Math.max(maxLength[i], maxLength[j]+1);
				}
			}
			max = Math.max(max, maxLength[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		LongestSubseq mySeq = new LongestSubseq();
		int[] nums = { 10,9,2,5,3,7,101,18};
		System.out.println((mySeq.longestSeq(nums)));
	}
}
