class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            if(a>0)
            {
                break;
            }
            if(i>0&&nums[i]==nums[i-1])
                    {
                        continue;
                    }
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                
                if(a+nums[l]+nums[r]<0)
                {
                    l++;
                }
                else if(a+nums[l]+nums[r]>0)
                {
                    r--;
                }
                else
                {
                    List<Integer> res=new ArrayList<>();
                    res.add(a);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    ans.add(res);
                    l++;
                    r--;
                    while(l<r&&nums[l]==nums[l-1])
                    {
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}
