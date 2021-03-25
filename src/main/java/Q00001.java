import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q00001 {
    public int[] twoSum(int[] nums, int target) {
        String numsStr=nums.toString();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int another=target-nums[i];

                for(int j=0;j<nums.length;j++){
                    if(another==nums[j]&&i!=j){
                        result[0]=i;
                        result[1]=j;
                        System.out.println("输出"+i+j);
                        return result;
                    }
                }


        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0; i < nums.length; i++){
                if(map.containsKey(nums[i])){
                    return new int[]{map.get(nums[i]), i};
                }
                if(!map.containsKey(target - nums[i])){
                    map.put(target - nums[i], i);
                }
            }
            return null;
    }
    public static void main(String[] args) {
        Q00001 q1=new Q00001();
        int[] arr=new int[]{2,7,11,15};
        int[] result=q1.twoSum2(arr,9);
        System.out.println(Arrays.toString(result));
    }
}
