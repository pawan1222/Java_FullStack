package Map;
import java.util.*;
/*
to count no of pair in the array whose nums[i] == nums[j] and i<j;
*/

public class map3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,8,5,1};
        Solution s = new Solution();
        int ans = s.numIdenticalPairs(nums);
        System.out.println(ans);
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int  count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]) count++;
        //     }
        // }
        // return count;

        Map<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                count+=map.get(num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}