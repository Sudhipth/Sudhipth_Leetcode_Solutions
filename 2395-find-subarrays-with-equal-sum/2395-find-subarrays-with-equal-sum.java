class Solution {
    public boolean findSubarrays(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];  
            if (!l.contains(sum)) {
                l.add(sum);
            } else {
                return true; 
            }
        }
        return false; 
    }
}
