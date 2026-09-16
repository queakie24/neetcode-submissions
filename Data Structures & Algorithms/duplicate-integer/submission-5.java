class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!temp.contains(nums[i])){temp.add(nums[i]);}
            else{return true;}
        }
        return false;
    }
}