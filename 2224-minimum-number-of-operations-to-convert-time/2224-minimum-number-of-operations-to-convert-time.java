class Solution {
    public int convertTime(String current, String correct) {
       String arr[]=current.split(":");
       String cor[]=correct.split(":");
       int arr1=Integer.parseInt(arr[0]);
       int arr2=Integer.parseInt(arr[1]);
       int cor1=Integer.parseInt(cor[0]);
       int cor2=Integer.parseInt(cor[1]);
       int ans1=cor1-arr1;
       int ans2=cor2-arr2;
       int ans=(ans2==0)?0:1;
       ans+=ans1;
       return ans;
    }
}