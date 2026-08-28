class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }


        int max=0;
        for(int i:hs)
        {
            if(!hs.contains(i-1))
            {
                int length=1;
                while(hs.contains(i+length))
                {
                    length++;
                }
                max=Math.max(length,max);
            }
        }
        return max;
    }
}
