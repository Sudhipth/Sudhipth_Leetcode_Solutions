class Solution {
    public int countElements(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++)
        {
           if(s<nums[i] && nums[i]<l)
           count++;
        }
        return count++;
    }
}