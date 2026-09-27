class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> temp = new HashMap<>();

        for (int i = 0; i < strs.length; i++){
            char[] temporary = strs[i].toCharArray();
            Arrays.sort(temporary);
            String sorted = new String(temporary);
            
            if (!temp.containsKey(sorted)){
                List<String> temp2 = new ArrayList<>();
                temp2.add(strs[i]);
                temp.put(sorted, temp2);
            }
            else{
                temp.get(sorted).add(strs[i]);
                temp.put(sorted, temp.get(sorted));
            }
        }
        return new ArrayList<>(temp.values());
    }
}
