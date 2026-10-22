class Solution {
    public StringBuilder giveString(StringBuilder st)
    {
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<st.length();i++)
        {
            if (Character.isLetterOrDigit(st.charAt(i))) 
            {
                s.append(st.charAt(i));
            }
        }
        return s;
    }
    public boolean isPalindrome(String s) {
        StringBuilder st=new StringBuilder(s.toLowerCase());
        st=giveString(st);
        int i=0,j=st.length()-1;
        while(i<=j)
        {
            if(st.charAt(i)!=st.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
