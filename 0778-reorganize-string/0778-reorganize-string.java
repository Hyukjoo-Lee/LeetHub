class Solution {

    public String reorganizeString(String s) {
        // Step 1: Count characters.
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        // Step 2: Use a priority queue.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (char i = 0; i < 26; i++) {
            if (count[i] > 0) {
                pq.offer(new int[]{i, count[i]});
            }
        }

        StringBuilder sb = new StringBuilder();
        // Step 3: Greedy construction.
        while (!pq.isEmpty()) {
            int[] first = pq.poll(); // Most frequent character.

            if (sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1) - 'a') {
                sb.append((char)(first[0] + 'a'));
                first[1]--;
                if (first[1] > 0) pq.offer(first); // Step 5.
            } else {
                if (pq.isEmpty()) {
                    return ""; // Step 4: No valid arrangement.
                }
                int[] second = pq.poll(); // Second most frequent character.
                sb.append((char)(second[0] + 'a'));
                second[1]--;
                if (second[1] > 0) pq.offer(second);
                pq.offer(first);
            }
        }
        // Step 6: Build result.
        return sb.toString();
    }
}