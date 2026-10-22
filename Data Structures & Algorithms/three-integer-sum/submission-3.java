class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainList=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-2)
        {
            if(nums[i]>0)
            {
                break;
            }
            if(i>0 && nums[i]==nums[i-1])
            {
                i++;
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                int sum=nums[j]+nums[k];
                if(sum==-nums[i])
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    mainList.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }
                else if(sum>(-nums[i]))
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
            i++;
        }
        return mainList;
    }
}
