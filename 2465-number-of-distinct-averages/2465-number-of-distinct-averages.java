class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Double> l=new ArrayList<>();
        for(int i=0;i<nums.length/2;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int index1=-1;
            int index2=-1;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=-1)
                {
                    if(max<nums[j])
                    {
                        max=nums[j];
                        index1=j;
                    }
                    if(min>nums[j])
                    {
                        min=nums[j];
                        index2=j;
                    }
                }
            }
            if(index1!=-1 && index2!=-1)
            {
               nums[index1]=-1;
              nums[index2]=-1;
              double d=(double)(max+min)/2;
              if(!l.contains(d))
               l.add(d);
            }
        }
        return l.size();
    }
}