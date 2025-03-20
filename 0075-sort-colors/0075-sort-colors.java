class Solution {
    public void sortColors(int[] nums) {
        int c1=0,c2=0,c3=0;
     for(int i :nums){
        if(i ==0){
            c1++;
        }
        else if(i==1){
            c2++;
        }
        else{
            c3++;
        }
     } 
     int j=0;
     for(int i =0;i<c1;i++){
        nums[j++]=0;
     }
      for(int i =0;i<c2;i++){
        nums[j++]=1;
     }  
      for(int i =0;i<c3;i++){
        nums[j++]=2;
     }   
    }
}