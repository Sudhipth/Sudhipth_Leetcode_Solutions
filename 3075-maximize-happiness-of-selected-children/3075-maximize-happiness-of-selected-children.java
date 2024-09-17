import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        
        long sum = 0;
        int decrement = 0;
        
        for (int i = happiness.length - 1; i >= 0 && k > 0; i--) {
            int effectiveHappiness = happiness[i] - decrement; 
            if (effectiveHappiness > 0) {
                sum += effectiveHappiness;
                k--;  
            }
            decrement++;
        }
        
        return sum;
    }
}
