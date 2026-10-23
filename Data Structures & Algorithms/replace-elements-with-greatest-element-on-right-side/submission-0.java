class Solution {
    public int rightMax(int[] arr,int i)
    {
        int max=Integer.MIN_VALUE;
        for(;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    } 
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=rightMax(arr,i+1);
        }
        arr[arr.length-1]=-1;
        return arr;
    }

}