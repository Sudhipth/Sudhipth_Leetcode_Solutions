class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length<=1)
        return pref;
        int ans[]=new int[pref.length];
        for(int i=1;i<pref.length;i++)
        {
            ans[i]=pref[i]^pref[i-1];
        }
        ans[0]=pref[0];
        return ans;
    }
}