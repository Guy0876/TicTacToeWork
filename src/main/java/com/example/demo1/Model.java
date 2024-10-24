package com.example.demo1;

import static com.example.demo1.AppConsts.*;

public class Model {


    static char [][] board = new char[ROWS][COLS];
    static {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public boolean isLegal(int row,int col)
    {
        return (row < ROWS && row >= 0 && col < COLS && col >= 0);
    }
    public boolean isBoardFull() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
    public char checkWin(int row,int col)
    {
        int i;
        for (i = 0; i < ROWS; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        for (i = 0; i < COLS; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        return ' ';
    }
}
