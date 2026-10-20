class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder("");
        String word=strs[0];
        Boolean flag=false;
        for(int i=0;i<word.length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length() || strs[j].charAt(i)!=word.charAt(i))
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                break;
            }
            else
            {
                s.append(word.charAt(i));
            }
        }
        return s.toString();
    }
}