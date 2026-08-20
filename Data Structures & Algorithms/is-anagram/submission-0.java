class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int ch=c-'a';
            char nc=t.charAt(i);
            int nch=nc-'a';
            arr[ch]++;
            arr[nch]--;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
