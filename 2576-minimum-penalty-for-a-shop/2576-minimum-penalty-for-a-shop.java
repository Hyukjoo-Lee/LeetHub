class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] openCount = new int[n];
        int[] closeCount = new int[n];

        for (int i = 0; i < n; i++) {
            openCount[i] = (i > 0 ? openCount[i - 1] : 0) + (customers.charAt(i) == 'N' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            closeCount[i] = (i < n - 1 ? closeCount[i + 1] : 0) + (customers.charAt(i) == 'Y' ? 1 : 0);
        }

        int minPenalty = Integer.MAX_VALUE;
        int bestClosingHour = -1;

        for (int j = 0; j <= n; j++) {
            int penalty = (j > 0 ? openCount[j - 1] : 0) + (j < n ? closeCount[j] : 0);

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestClosingHour = j;
            }
        }

        return bestClosingHour;
    }
}
