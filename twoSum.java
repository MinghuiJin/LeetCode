class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        
        int[] sol = new int[2];      
        for (int i=0; i < nums.length; i++){
            if (pairs.containsKey(target - nums[i])) {
                sol[0] = i;
                sol[1] = pairs.get(target - nums[i]);
                break;
            }
            pairs.put(nums[i], i);
        }
        return sol;
    }
}
