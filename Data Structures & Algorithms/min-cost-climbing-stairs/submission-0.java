class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] temp = new int[cost.length+1];
        for (int i = 2; i < temp.length; i++){
            temp[i] = Math.min(temp[i-1] + cost[i-1], temp[i-2] + cost[i-2]);
        }
        return temp[temp.length-1];
    }
}
