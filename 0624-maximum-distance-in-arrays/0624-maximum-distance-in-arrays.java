class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<arrays.size();i++)
       {
           for(int j=0;j<arrays.get(i).size();j++)
           {
               min=Math.min(arrays.get(i).get(j),min);
               max=Math.max(arrays.get(i).get(j),max);
           }
       }
       return max-min;
    }
}