class Solution {
    public int minChanges(int n, int k) {
        if(n == k){
            return 0;
        }
        String s = Integer.toBinaryString(n) ;
        String s1 = Integer.toBinaryString(k) ;
        while(s.length() < s1.length()){
            s = '0' + s ;
        }
        while(s1.length() < s.length()){
            s1 = '0' + s1 ;
        }
        char[] ch = s.toCharArray() ;
        int c = 0 ;
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == '1' && s1.charAt(i) == '0'){
                ch[i] = '0' ;
                c++;
            }
        }
        s = new String(ch) ;
        if(s.equals(s1)){
            return c;
        }
        return -1;
    }
}