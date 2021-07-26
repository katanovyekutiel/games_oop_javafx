package ru.job4j.puzzle;

public class Win {
    public static boolean checkHorizontal(int[][] board, int row) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 1) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 1) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static char[] checkDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkHorizontal(board, i)
                    || checkVertical(board, i))) {
                rsl = true;
            }
        }
        return rsl;
    }

}
