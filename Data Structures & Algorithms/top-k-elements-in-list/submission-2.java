class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

        for(int i:mpp.keySet())
        {
            pq.add(new int[]{i,mpp.get(i)});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] res=new int[k];
        int j=0;
        while(!pq.isEmpty())
        {
            res[j++]=pq.poll()[0];
        }
        return res;
    }
}
