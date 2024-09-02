class Solution {
    public long countVowels(String word) {
        ArrayList<String> l=new ArrayList<>();
        String vow="aeiou";
        for(int i=0;i<word.length();i++)
        {
            String s="";
            s+=word.charAt(i);
            l.add(s);
            for(int j=i+1;j<word.length();j++)
            {
                s+=word.charAt(j);
                l.add(s);
            }
        }
        long sum=0;
        for(int i=0;i<l.size();i++)
        {
            String s=l.get(i);
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                String ss="";
                ss+=s.charAt(j);
                 if(vow.contains(ss))
                 count++;
            }
            sum+=count;
        }
        return sum;

    }
}