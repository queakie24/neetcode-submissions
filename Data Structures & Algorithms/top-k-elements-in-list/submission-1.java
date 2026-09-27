class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!temp.containsKey(nums[i])){temp.put(nums[i], 1);}
            else{temp.put(nums[i], temp.get(nums[i])+1);}
        }
        int[] temp2 = new int[k];
        for (int i = 0; i < k; i++){
            temp2[i] = Collections.max(temp.entrySet(), Map.Entry.comparingByValue()).getKey();
            temp.remove(temp2[i]);
        }
        return temp2;
    }
}
