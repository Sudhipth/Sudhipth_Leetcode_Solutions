class Solution {
    public int lengthOfLongestSubstring(String s) {

    int n = s.length();
    int count = 0 ;
    for(int i = 0 ; i < n ; i++)
    {
    boolean[] ch = new boolean[256];
    for(int j = i ; j < n ; j++)
    {
        if(ch[s.charAt(j)])
        {
            break;
        }
        ch[s.charAt(j)] = true;
        count = Math.max(count , j - i + 1);
    }
    }
    return count;

    }
}