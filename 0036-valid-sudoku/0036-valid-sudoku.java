class Solution {
    public boolean isValidSudoku(char[][] board) {
        /**
            9 x 9 수도쿠 보드를 나타내는 2D 배열이 주어지고
            수도쿠를 판단하는 문제입니다.

            1. 각 행에 반복되는 숫자가 없는지 확인
            2. 각 열에 반복되는 숫자가 없는지 확인
            3. 각 3 x 3 sub-boxes 에 반복되는 숫자가 없는지 확인

            3가지 규칙을 모두 충족하면 true
            아니면 false 를 리턴하는 문제입니다. 

            하 복잡..
         */

            // 각 행에 대한 체크
            for (int row = 0; row < 9; row++) {
                boolean[] rowCheck = new boolean[9];
                for (int col = 0; col < 9; col++) {
                    if (board[row][col] != '.') {
                        int num = board[row][col] - '1';
                        if (rowCheck[num]) { // 이미 숫자가 존재하면
                            return false; 
                        }
                        rowCheck[num] = true; // 숫자를 체크했음
                    }
                }
            }
        
            // 각 열에 대한 체크
            for (int col = 0; col < 9; col++) {
                boolean[] colCheck = new boolean[9];
                for (int row = 0; row < 9; row++) {
                    if (board[row][col] != '.') {
                        int num = board[row][col] - '1';
                        if (colCheck[num]) {
                            return false;
                        }
                        colCheck[num] = true; 
                    }
                }
            }
        
            // 3 x 3 sub-boxes에 대한 체크
            for (int box = 0; box < 9; box++) {
                boolean[] boxCheck = new boolean[9];
                for (int row = box / 3 * 3; row < box / 3 * 3 + 3; row++) {
                    for (int col = box % 3 * 3; col < box % 3 * 3 + 3; col++) {
                        if (board[row][col] != '.') {
                            int num = board[row][col] - '1';
                            if (boxCheck[num]) {
                                return false; 
                            }
                            boxCheck[num] = true; 
                        }
                    }
                }
            }

        
        return true;
    }
}