class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];

        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],i);
        }

        int i;
        int k=0;
        for(i=0;i<nums.length;i++)
        {
             k=target-nums[i];
            if(mpp.containsKey(k)&&i!=mpp.get(k))
            {
                break;
            }
        }
        arr[0]=i;
        arr[1]=mpp.get(k);
        return arr;
    }
}
