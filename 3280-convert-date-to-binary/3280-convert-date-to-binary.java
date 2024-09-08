class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        String s="";
        for(int i=0;i<arr.length;i++)
           s+= Integer.toBinaryString(Integer.parseInt(arr[i]))+"-";
        return s.substring(0,s.length()-1);
    }
}