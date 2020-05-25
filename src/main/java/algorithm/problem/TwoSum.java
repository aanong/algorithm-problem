package algorithm.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 两数之和
 * 思路一：遍历数组，返回
 *
 *
 * @Author clq
 * @Date 2020/5/22 11:14
 * @Version 1.0
 */
public class TwoSum {


    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15,2,5,1,4};
        int target = 4;
        hashTwoSum(array,target);
    }

    public static int[] twoSum(int[] array,int target){
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]+array[j]==target){
                    System.out.println("i:"+i+"j:"+j);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    //一遍hash表
    public static int[] hashTwoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <nums.length ; i++) {
            int sdd= target-nums[i];
            if(map.containsKey(sdd)){
                System.out.println("i:"+map.get(sdd)+"j:"+i);
                return new int[]{map.get(sdd),nums[i]};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }




}
