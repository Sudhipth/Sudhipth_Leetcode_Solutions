class Solution {
    public List<String> printVertically(String s) {
        List<String> l=new ArrayList<>();
        String[] str=s.split(" ");
        int max=0;
        for(int i=0;i<str.length;i++)
        {
            max=Math.max(max,str[i].length());
        }
        for(int i=0;i<max;i++)
        {
            String ss="";
            for(int j = 0 ; j < str.length ; j++){
                if(str[j].length() <= i){
                    ss += " ";
                }
                else{
                    ss += str[j].charAt(i) ;
                }
            }
            l.add(ss.replaceFirst("\\s+$", ""));
        }
        return l;
    }
}