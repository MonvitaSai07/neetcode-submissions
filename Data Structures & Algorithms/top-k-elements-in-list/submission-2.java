class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int nu : nums)
        {
            hm.put(nu,hm.getOrDefault(nu,0)+1);
        }
         
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
             int mfr=0;
            int mval=0;
         for(Map.Entry<Integer,Integer> en : hm.entrySet()) 
        {
            if(en.getValue() > mfr)
            {
                mfr=en.getValue();
                mval=en.getKey();
            }
        }  
        ans[i]=mval;
        hm.remove(mval);
        }
        return ans;
    }
}