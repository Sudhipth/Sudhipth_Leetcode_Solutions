class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
           if(min>nums.get(i))
           {
            min=nums.get(i);
            index=i;
           }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=index;i<nums.size();i++)
        {
            l.add(nums.get(i));
        }
        for(int i=0;i<index;i++)
        {
            l.add(nums.get(i));
        }
        for(int i=1;i<l.size();i++)
        if(l.get(i)<l.get(i-1))
        return -1;
        if(index==0)
        return index;
        return l.size()-index;
    }
}