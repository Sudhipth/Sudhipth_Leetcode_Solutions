class Solution {
    public int check(String s){
        int c = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'W'){
                c++;
            }
        }
        return c ;
    }
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < blocks.length() - k + 1 ; i++){
            min = Math.min(min , check(blocks.substring(i , i + k)));
        }
        return min;
    }
}