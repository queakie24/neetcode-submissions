class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++){
            if (temp.isEmpty() || temperatures[i] < temperatures[temp.peek()]){
                temp.push(i);
            }
            else{
                while(!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()]){
                    int curr = temp.pop();
                    ans[curr] = i-curr;
                }
                temp.push(i);
            }
        }
        return ans;
    }
}
