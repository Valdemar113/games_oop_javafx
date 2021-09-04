package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for(int x = 0; x < board.length; x++) {
            if(board[x][x] == 1 && (horizontal(board,x) || vertical(board, x))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontal( int[][] board, int row) {
        boolean rsl = true;
        for( int index = 0; index < board[row].length; index++) {
            if(board[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int cell) {
        boolean rsl = true;
        for(int i = 0; i < board[cell].length; i++) {
            if(board[i][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }


}
