package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char x1 = 'X';
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != x1) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char x1 = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != x1) {
                result = false;
                break;
            }
        }
        return result;
    }
}