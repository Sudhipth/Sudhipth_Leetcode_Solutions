class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        check(ans,ds,nums,0);
        return ans;
    }
    public void check(List<List<Integer>> ans,List<Integer> ds,int[] nums,int index)
    {
        List<Integer> d=new ArrayList<>(ds);
        if(!ans.contains(d))
        ans.add(d);
        for(int i=index;i<nums.length;i++)
        {
                ds.add(nums[i]);
                check(ans,ds,nums,i+1);
                ds.remove(ds.size()-1);
        }
    }
}