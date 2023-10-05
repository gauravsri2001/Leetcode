class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> m = new HashMap<Character,Integer> ();
        int left =0;
        int right =0;
        int n = s.length();
        int len = 0;
        while(right<n){
            if(m.containsKey(s.charAt(right))){
                left = Math.max(m.get(s.charAt(right)) + 1, left);
            }
            m.put(s.charAt(right),right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}