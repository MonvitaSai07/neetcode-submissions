class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        int l=0,r,k;
        while(l<n-2)
        {
            if(l>0  && nums[l]==nums[l-1])
            { l++; continue;
            }
            int p= nums[l];
            r=l+1;
            k=n-1;
            while(r<k)
            {
                if(p+nums[r]+nums[k]==0)
                {   
                    res.add(Arrays.asList(nums[l],nums[r],nums[k]));
                    r++;k--;
                    while(r<k && nums[r]== nums[r-1]) r++;
                }
               else if(nums[r]+nums[k]+p<0) r++;
                else k--;
            }
            l++;
        }
        return res;
    }
}
