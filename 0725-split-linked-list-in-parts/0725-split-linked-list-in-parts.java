class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int totalLength = 0;
        ListNode current = head;
        while (current != null) {
            totalLength++;
            current = current.next;
        }
        int baseSize = totalLength / k;
        int extraParts = totalLength % k;

        ListNode[] result = new ListNode[k];

        current = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = current;
            int currentPartSize = baseSize + (i < extraParts ? 1 : 0);
            for (int j = 1; j < currentPartSize && current != null; j++) {
                current = current.next;
            }
            
            if (current != null) {
                ListNode next = current.next;
                current.next = null;
                current = next;
            }
            result[i] = partHead;
        }

        return result;
    }
}