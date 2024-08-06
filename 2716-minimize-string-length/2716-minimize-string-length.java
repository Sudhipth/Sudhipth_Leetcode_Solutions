class Solution {
    public int minimizedStringLength(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String str=String.valueOf(arr);
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(i==0)
            st.push(str.charAt(i));
            else if(!st.empty())
            {
                if(st.peek()!=str.charAt(i))
                st.push(str.charAt(i));
            }
        }
        return st.size();
    }
}