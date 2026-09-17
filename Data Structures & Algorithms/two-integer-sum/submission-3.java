class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> temp = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (!temp.containsKey(nums[i])){
                temp.put(target-nums[i], i);
            }
            else{
                ans[0] = temp.get(nums[i]);
                ans[1] = i;
            }
        }
        return ans;
    }
}
