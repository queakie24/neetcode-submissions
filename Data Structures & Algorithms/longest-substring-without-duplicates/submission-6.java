class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> temp = new HashSet<>();
        while (j < s.length()){
            if (!temp.contains(s.charAt(j))){
                temp.add(s.charAt(j));
                j++;
            }
            else{
                max = Math.max(max, j-i);
                while (temp.contains(s.charAt(j))){
                    temp.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return Math.max(max, j-i);
    }
}
