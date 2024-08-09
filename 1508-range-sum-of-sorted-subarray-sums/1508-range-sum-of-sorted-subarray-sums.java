class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            sum+=nums[i];
            l.add(nums[i]);
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                l.add(sum);
            }
        }
        Collections.sort(l);
        int sum=0;
        int resultSum = 0;
        int mod = 1_000_000_007;  
        for (int i = left - 1; i < right; i++) {
            resultSum = (resultSum + l.get(i)) % mod;
        }
        
        return resultSum;
    }
}