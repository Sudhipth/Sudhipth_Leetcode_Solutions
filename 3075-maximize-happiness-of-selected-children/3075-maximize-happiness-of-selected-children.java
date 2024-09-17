class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        Arrays.sort(happiness);
        for(int i=0;i<k;i++)
        {
           if(happiness[happiness.length-1-i]>=0)
           sum+=happiness[happiness.length-1-i];
           for(int j=0;j<happiness.length;j++)
              happiness[j]--;
        }
        return sum;
    }
}