class Solution {
    public int findComplement(int num) {
      String  str=  Integer.toBinaryString(num);
      str=str.replace('0','3');
      str=str.replace('1','4');
      str=str.replace('3','1');
      str=str.replace('4','0');
      return  Integer.parseInt(str,2);
    }
}