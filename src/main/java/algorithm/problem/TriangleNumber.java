package algorithm.problem;

import java.util.Arrays;

/**
 * 验证三角形
 */
public class TriangleNumber {
    public static void main(String[] args) {
        int[] ds = {2,2,3,4,5};
        System.out.println(new TriangleNumber().triangleNumber(ds));

    }

    public int triangleNumber(int[] nums) {
        if(nums==null||nums.length<3){
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=2  ; i--) {
            int start = 0;
            int end = i-1;
            while (end>start){
                if(nums[start]+nums[end]>nums[i]){
                    count = count +(end-start);
                    end--;
                }else {
                    start++;
                }
            }
        }
        return count;
    }

}
