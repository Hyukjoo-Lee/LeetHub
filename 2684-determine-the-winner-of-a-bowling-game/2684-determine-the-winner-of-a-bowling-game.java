class Solution {
    public int isWinner(int[] player1, int[] player2) {
        /**
            if a player hit 10 pins in previous two turns 2*score
            for(int num : player1) {
                if(num[i] == 10)
                    new intarr[i+1] = intarr[i+1] * 2
            }
         */
         if(player1.length == 1) {
            if(player1[0] > player2[0]) {
                return 1;
            } else if(player1[0] < player2[0]) {
                return 2;
            } else {
                return 0;
            }
         }

         int player1Total = player1[0];
         int player2Total = player2[0];
         
         if(player1[0] == 10) {
            player1Total += player1[1] * 2;
         } else {
            player1Total += player1[1];
         }

         if(player2[0] == 10) {
            player2Total += player2[1] * 2;
         } else {
            player2Total += player2[1];
         }

         for(int i = 2; i < player1.length; i++) {
             if(player1[i - 1] == 10 || player1[i - 2] == 10)  player1Total += player1[i];
             if(player2[i - 1] == 10 || player2[i - 2] == 10)  player2Total += player2[i];
             player1Total += player1[i];
             player2Total += player2[i];
         }

         if(player1Total > player2Total) {
             return 1;
         } else if(player2Total > player1Total) {
             return 2;
         } else {
             return 0;
         }
















    }
}