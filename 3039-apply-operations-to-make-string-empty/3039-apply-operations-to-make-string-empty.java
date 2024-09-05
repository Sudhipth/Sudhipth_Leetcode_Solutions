class Solution {
    public String lastNonEmptyString(String s) {
        char[] arr = s.toCharArray();
        int[] num = new int[256]; // To count occurrences of each character
        int max = 0;

        // Count character frequencies in one pass
        for (char c : arr) {
            num[c]++;
            max = Math.max(max, num[c]); // Track the maximum frequency
        }

        StringBuilder result = new StringBuilder();
        ArrayList<Character> uniqueChars = new ArrayList<>();

        // Traverse the array in reverse to collect characters with the max frequency
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!uniqueChars.contains(arr[i]) && num[arr[i]] == max) {
                uniqueChars.add(arr[i]);
                result.append(arr[i]); // Directly build the result in reverse order
            }
        }

        // Return the final result (no need to reverse)
        return result.toString();
    }
}
