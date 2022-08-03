package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][0] != board[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
