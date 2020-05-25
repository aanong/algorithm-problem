# algorithm-problem
#### 1.两数之和
  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

  示例:

  给定 nums = [2, 7, 11, 15], target = 9

  因为 nums[0] + nums[1] = 2 + 7 = 9
  所以返回 [0, 1]

##### 暴力解
  2遍遍历数组，判断2数和是否与`target` 相等
  第二次只需要遍历i以后的数据即可
  ````java
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
  ````
##### 一遍hash表
  遍历数组，将速
