class Solution {
    public int maxScore(String s) {
        int one=0;
        int zero=0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                one++;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')
            zero++;
            else
            one--;
            int tot=zero+one;
            max=Math.max(tot,max);
        }
        return max;
    }
}