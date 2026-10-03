class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int numOfZeroes = 0;
        int total = 1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){numOfZeroes++;}
            else{total *= nums[i];}
        }

        if (numOfZeroes >= 2){return ans;}
        else if (numOfZeroes == 1){
            for (int i = 0; i < nums.length; i++){
                if (nums[i] == 0){
                    ans[i] = total;
                    return ans;
                }
            }
        }
        else{
            for (int i = 0; i < nums.length; i++){
                ans[i] = total / nums[i];
            }
            return ans;
        }
        return null;
    }
}  
