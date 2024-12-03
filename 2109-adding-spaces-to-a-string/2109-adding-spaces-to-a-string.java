class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int n=0;
        for(int i=0;i<s.length();i++)
        {
            if( n< spaces.length && spaces[n]==i )
            {
                ans.append(" ");
                n++;
            }
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}