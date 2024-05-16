수도쿠의 유효성을 검사하는 문제입니다.

```java
// 각 행에 대한 체크
for (int row = 0; row < 9; row++) {
    boolean[] rowCheck = new boolean[9];
    for (int col = 0; col < 9; col++) {
        if (board[row][col] != '.') {
            int num = board[row][col] - '1';
            if (rowCheck[num]) {
                return false; // 이미 숫자가 존재하면 유효하지 않음
            }
            rowCheck[num] = true; // 숫자를 체크했음을 표시
        }
    }
}
```

위 코드에서 `rowCheck` 배열은 현재 행에 어떤 숫자가 이미 등장했는지를 기록합니다. 
이중 반복문을 사용하여 각 셀을 검사하고, 숫자가 '.'이 아닌 경우 해당 숫자가 이미 `rowCheck` 배열에 존재하는지 확인합니다. 
숫자가 이미 존재한다면 중복이므로 유효하지 않은 수도쿠입니다.

다음으로, 각 열에 대한 유효성을 검사하는 부분입니다.

```java
// 각 열에 대한 체크
for (int col = 0; col < 9; col++) {
    boolean[] colCheck = new boolean[9];
    for (int row = 0; row < 9; row++) {
        if (board[row][col] != '.') {
            int num = board[row][col] - '1';
            if (colCheck[num]) {
                return false; // 이미 숫자가 존재하면 유효하지 않음
            }
            colCheck[num] = true; // 숫자를 체크했음을 표시
        }
    }
}
```

각 열에 대해 비슷한 방식으로 숫자의 중복을 검사하고, `colCheck` 배열을 사용하여 중복된 숫자를 체크합니다.

```java
// 3 x 3 sub-boxes에 대한 체크
for (int box = 0; box < 9; box++) {
    boolean[] boxCheck = new boolean[9];
    for (int row = box / 3 * 3; row < box / 3 * 3 + 3; row++) {
        for (int col = box % 3 * 3; col < box % 3 * 3 + 3; col++) {
            if (board[row][col] != '.') {
                int num = board[row][col] - '1';
                if (boxCheck[num]) {
                    return false; // 이미 숫자가 존재하면 유효하지 않음
                }
                boxCheck[num] = true; // 숫자를 체크했음을 표시
            }
        }
    }
}
```

각 하위 상자에 대해 비슷한 방식으로 숫자의 중복을 검사하고, `boxCheck` 배열을 사용하여 중복된 숫자를 체크합니다.

이렇게 하여 주어진 스도쿠 보드가 유효한지 확인할 수 있습니다.
