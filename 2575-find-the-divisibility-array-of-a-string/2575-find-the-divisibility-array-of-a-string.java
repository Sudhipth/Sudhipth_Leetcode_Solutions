class Solution {
    public int[] divisibilityArray(String word, int m) {
        int arr[]=new int[word.length()];
        int i=0;
        int j=1;
        long c=0;
        while(j<=word.length())
        {
            c = c * 10 + (word.charAt(i) - '0');
            c %= m;
            if(n%m==0)
            {
                arr[j-1]=1;
            }
            j++;
        }
        return arr;
    }
}