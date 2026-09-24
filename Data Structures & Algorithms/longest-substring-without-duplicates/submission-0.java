class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int max=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(i));
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
