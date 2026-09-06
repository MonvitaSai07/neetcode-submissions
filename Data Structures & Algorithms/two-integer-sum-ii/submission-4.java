class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int l=0;
        int r=n-1;
        while(l!=r)
        {
            int p= numbers[l]+numbers[r];
            if(target == p)
            {
                return new int[]{l+1,r+1};
            }
            else if (p< target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return new int[]{};
    }
}
