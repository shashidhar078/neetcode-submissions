class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int r=0;
        int l=0;
        int maxLen=0;
        int maxFreq=0;
        int ans=0;
        while(r<s.length())
        {
            hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,hs.getOrDefault(s.charAt(r),0));
            maxLen=Math.max(maxLen,r-l+1);
            int count=maxLen-maxFreq;
            if(count>k)
            {
                count--;
                int a=hs.get(s.charAt(l));
                a--;
                if(hs.getOrDefault(l,0)==0)
                {
                    hs.remove(s.charAt(l));
                }
                hs.put(s.charAt(l),a);
                l++;
            }
            ans=Math.max(r-l+1,ans);
            r++;
        }
        return ans;
    }
}
