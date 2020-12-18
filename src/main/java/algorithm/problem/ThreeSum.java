package algorithm.problem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 三数和
 * @Author clq
 * @Date 2020/5/22 11:13
 * @Version 1.0
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] ds = {-2,0,0,2,2};
        ;

        System.out.println(new ThreeSum().threeSum(ds).toString());

    }

    /**
     * 暴力解
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums==null||nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i<len-2;i++){
            if(i > 0 && nums[i] ==nums[i-1]){
                continue;
            }
            int left = i +1;
            int right = len-1;
            while(left<right){
//                if(nums[left-1]==nums[left]||nums[right+1]==nums[right]){
//                    continue;
//                }
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> intList = new ArrayList();
                    intList.add(nums[i]);
                    intList.add(nums[left]);
                    intList.add(nums[right]);
                    result.add(intList);
                    left++;
                    right--;
                    while (left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right+1]){
                        right--;
                    }

                }else if(nums[i]+nums[right]+nums[left]<0){
                    left++;
                }else{
                    right--;
                }


            }




        }
        return result;

    }

}
