class Solution {
    public boolean isPalindrome(String s) {
        //change the given string into alpha numeric 
        StringBuilder stb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
             char c=s.charAt(i);
             if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9')
             {
                stb.append(c);
             }
        }
        int start=0;
        int end=stb.length()-1;
        String str=stb.toString().toLowerCase();
        for(int i=0;i<stb.length()/2;i++)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
