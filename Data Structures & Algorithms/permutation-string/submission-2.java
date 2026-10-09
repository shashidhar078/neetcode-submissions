class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        
        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            mpp.put(s1.charAt(i),mpp.getOrDefault(s1.charAt(i),0)+1);
        }

        HashMap<Character,Integer> hs=new HashMap<>();
        int r=0;
        while(r<s1.length())
        {
            char c=s2.charAt(r);
            hs.put(c,hs.getOrDefault(c,0)+1);
            r++;
        }
        if(hs.equals(mpp))
        {
            return true;
        }
        int l=0;
        while(r<s2.length())
        {
            int a=hs.get(s2.charAt(l));
            a--;
            if(a==0)
            {
                hs.remove(s2.charAt(l));
            }
            else
            {
                hs.put(s2.charAt(l),a);
            }
            l++;
            char c=s2.charAt(r);
            hs.put(c,hs.getOrDefault(c,0)+1);
            r++;
            if(hs.equals(mpp))
            {
                return true;
            }
        }
        return false;
    }
}
