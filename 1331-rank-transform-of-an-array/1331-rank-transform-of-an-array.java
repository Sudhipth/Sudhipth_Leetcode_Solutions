class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
                HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        ArrayList<Integer> sortedUniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(sortedUniqueList);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedUniqueList.size(); i++) {
            rankMap.put(sortedUniqueList.get(i), i + 1); 
        }
        for (int i = 0; i < n; i++) {
            ans[i] = rankMap.get(arr[i]);
        }

        return ans;
    }
}