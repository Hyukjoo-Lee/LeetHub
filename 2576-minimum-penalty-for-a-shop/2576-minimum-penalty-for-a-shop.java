class Solution {
    public int bestClosingTime(String customers) {
        /**
            customers 
            - shop is open and no customers come
            - shop is closed and customers come
            return earliest hour
            shop must be closed to incur a minimum penalty
            상점이 열려있지만 해당 시간에 고객이 들어오지 않은 경우 (i < hour) hour = 상점의 특정 시간, i 도 시간대 ()
            if 0,  YYNY = (3)
                      h(상점이 현재 열려있는 시간)
                     i(고객이 방문하는 시간)
                      
            if 1, Y YNY = (2)
            if 2, YY NY = (1)
            if 3, YYN(1) Y (1) = (2)
            if 4, YYNY (1)

            jth hour 
            0 <= j <= n
            
            if customers = "YYNY"
            0 <= j <= customers.length;

            count 
            
            how to set these two conditions?
            
            // iterate from 0 to customers.length
            for(int j = 0; j < customers.length; j++)
                when 0, we should scan the characters within customers
                from customers.charAt(0) ~ customers.charAt(customers.length)
                if YYNY
                if(customers.cha)
            
         */

        int[] openCount = new int[customers.length()]; // shop is open and no customers come (N)
        int[] closeCount = new int[customers.length()]; // shop is closed and customers come (Y)

        // Initialize the openCount
        if (customers.charAt(0) == 'N') {
            openCount[0] = 1;
        } else {
            openCount[0] = 0;
        }

        // Calculate the openCount for each hour
        for (int i = 1; i < customers.length(); i++) {
            openCount[i] = openCount[i - 1];
            if (customers.charAt(i) == 'N') {
                openCount[i]++;
            }
        }

        // Initialize the closeCount
        if (customers.charAt(customers.length() - 1) == 'Y') {
            closeCount[customers.length()- 1] = 1;
        } else {
            closeCount[customers.length() - 1] = 0;
        }

        // Calculate the closeCount for each hour
        for (int i = customers.length() - 2; i >= 0; i--) {
            closeCount[i] = closeCount[i + 1];
            if (customers.charAt(i) == 'Y') {
                closeCount[i]++;
            }
        }

        int minPenalty = Integer.MAX_VALUE;
        int bestClosingHour = -1;
        // [0,0,1,1] (시작부터 각 시간까지 'N'의 누적)
        // [3,2,1,1] (끝부터 각 시간까지 'Y'의 누적)
        // 'N' 고객의 누적 합계와 'Y' 고객의 누적 합계를 알면 각 시간대별로 문을 닫았을 때의 패널티를 계산할 수 있다.
        // if j = 3 => store 가 3시간 후에 문을 닫을 때
        for (int j = 0; j <= customers.length(); j++) {
            int penalty = 0;

            //  3시간까지의 'N' 누적 openCount[3], 마지막 'N' 고객을 서비스하지 않았기 때문에 손해가 1이 발생
            if (j > 0) {
                penalty += openCount[j - 1];
            }

            // 4시간 후에는 어떤 고객도 서비스하지 않아야 하므로 = 0 이고 
            if (j < customers.length()) {
                penalty += closeCount[j];
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestClosingHour = j;
            }
        }

        return bestClosingHour;
    }
}
