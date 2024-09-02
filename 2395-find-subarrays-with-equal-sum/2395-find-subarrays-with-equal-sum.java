class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=1;i<nums.length;i++){
         int a = nums[i]+nums[i-1];
         if(s.contains(a))
         return true;
         s.add(a);
        }
        return false;
    
    }
}