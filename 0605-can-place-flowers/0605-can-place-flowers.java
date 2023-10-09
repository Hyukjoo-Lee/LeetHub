class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /**
            cannot be planted in adjacent plots
            0 - empty
            1 - planted
            [1,0,0,0,1] n = 1
            - index-1, index+1 empty => n--
            - if(i == 0)
            - if(i == flowerbed.length - 1)
         */
        
        // [1,0,0,0,1,0,0], n = 2
        for(int i = 0; i < flowerbed.length; i++) {
            boolean isNextEmpty = (i == flowerbed.length - 1 || flowerbed[i+1] == 0);
            boolean isPrevEmpty = (i == 0 || flowerbed[i-1] == 0);

            if(flowerbed[i] != 1 && isNextEmpty && isPrevEmpty) {
                flowerbed[i] = 1;
                n--;
            }

        }

        if(n > 0) {
            return false;
        }

        return true;
    }
}