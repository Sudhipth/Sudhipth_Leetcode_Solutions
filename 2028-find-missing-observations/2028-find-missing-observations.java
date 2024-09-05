class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int tot=0;
        for(int i=0;i<rolls.length;i++)
        tot+=rolls[i];
        int mul=mean*(rolls.length+n);
        int ans=mul-tot;
        if(ans<n || 6*n<ans)
        return new int[0];
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            int nn=Math.min(6,ans-n+1);
            arr[i]=nn;
            ans=ans-nn;
            n-=1;
        }
        return arr;
    }
}