class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length*2;
        int[] ans=new int[len];
        int i=0,j=0;
        while(i<len)
        {
            if(j==nums.length)
            {
                j=0;
                ans[i]=nums[j];
            }
            else
            {
                ans[i]=nums[j];
                i++;
                j++;
            }
        }
        return ans;
    }
}