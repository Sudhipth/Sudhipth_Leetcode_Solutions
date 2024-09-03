class Solution {
    public int getLucky(String s, int k) {
         String str = "";
        for (int j = 0; j < s.length(); j++) {
             str += s.charAt(j) - '0'-48;
            }
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int h = 0; h < str.length(); h++) {
                sum += str.charAt(h) - '0';
            }
            str = String.valueOf(sum);
        }
        return Integer.parseInt(str);
    }
}