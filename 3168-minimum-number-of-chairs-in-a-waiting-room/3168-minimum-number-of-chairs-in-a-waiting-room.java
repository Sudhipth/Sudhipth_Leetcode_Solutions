class Solution {
    public int minimumChairs(String s) {
        Stack<Character> stk = new Stack<>();
        int max = 0 ;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'E'){
                stk.push('E');
            }
            else if(s.charAt(i) == 'L'){
                stk.pop();
            }
            max = Math.max(stk.size() , max);
        }
        return max;
    }
}