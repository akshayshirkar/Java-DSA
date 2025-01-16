import java.util.HashMap;
import java.util.Map;

public class twosum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> resultMap = new HashMap <>();
        for(int i=0;i<nums.length;i++){
            Integer indexVlaue = resultMap.get(nums[i]);
            if(indexVlaue != null ){
                return new int[]{i,indexVlaue};
            }
               resultMap.put(target - nums[i],i);
        }
        return nums;
    }
}

}
