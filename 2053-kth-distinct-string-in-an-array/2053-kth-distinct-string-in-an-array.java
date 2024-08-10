class Solution {
    public String kthDistinct(String[] arr, int k) {
        int []fre=new int[arr.length];
        int n=0; 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                fre[i]++;
            }
            if(fre[i]==1)
            {
              n++;
              if(n==k)
              return arr[i];
            }
        }
        return "";
    }
}